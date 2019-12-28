package com.zerobank.step_Definations;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utulities.ConfigurationReader;
import com.zerobank.utulities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefination {
    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("the user is logged in {string} {string}")
    public void the_user_is_logged_in(String string, String string2) throws InterruptedException {
        loginPage.openUrl();
        loginPage.loginPositive(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }
    @When("the user clicks on {string} link on the Account Summary page")
    public void theUserClicksOnLinkOnTheAccountSummaryPage(String arg12) {
        accountSummaryPage.clickAccountButton(arg12);
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        accountSummaryPage.accountActivityDisplayed();
    }
    @And("Account drop down should have {string} selected")
    public void accountDropDownShouldHaveSelected(String arg0) {
        Assert.assertTrue("Default value didn't match", accountActivityPage.accountdefaultVerify(arg0));
        Driver.closeDriver();
    }








}

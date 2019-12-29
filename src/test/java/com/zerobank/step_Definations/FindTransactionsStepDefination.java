package com.zerobank.step_Definations;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.FindTransaction;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PageBase;
import com.zerobank.utulities.ConfigurationReader;
import com.zerobank.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.text.ParseException;

public class FindTransactionsStepDefination {
    PageBase pageBase = new PageBase();
    LoginPage loginPage = new LoginPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    FindTransaction findTransactionpage = new FindTransaction();


    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() throws InterruptedException {
        loginPage.openUrl();
        loginPage.loginPositive(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        pageBase.navigateTo("Account Activity");
        pageBase.navigateTo("Find Transactions");

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
        accountActivityPage.enterDate(fromDate, toDate);

    }


    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) throws ParseException {
        Assert.assertTrue(findTransactionpage.datesVerify());
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String dates) {
        findTransactionpage.containsDates(dates);
        Driver.closeDriver();
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String description) {
findTransactionpage.descriptionEnter(description);
    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {

    }

    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {

    }

    @Given("clicks search")
    public void clicks_search() {
        accountActivityPage.findClick();
    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {

    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {

    }

    @When("user selects type {string}")
    public void user_selects_type(String string) {

    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {

    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {

    }

}

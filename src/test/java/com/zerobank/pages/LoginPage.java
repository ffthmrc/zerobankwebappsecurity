package com.zerobank.pages;

import com.zerobank.utulities.ConfigurationReader;
import com.zerobank.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.font.TextHitInfo;
import java.util.concurrent.TimeUnit;

public class LoginPage extends PageBase {

    @FindBy(id = "signin_button")
    public WebElement signInButton;
    @FindBy(id = "user_login")
    public WebElement userlogin;
    @FindBy(id = "user_password")
    public WebElement userpassword;
    @FindBy(css = ".btn.btn-primary")
    public WebElement signInSubmit;


    public void openUrl() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void loginPositive(String username, String password) throws InterruptedException {
        signInButton.click();
        //Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        userlogin.sendKeys(username);
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userpassword.sendKeys(password);
        signInSubmit.click();
    }

    public void loginNegative() {
        signInButton.click();
        userlogin.sendKeys("");
        userpassword.sendKeys("");
        signInSubmit.click();
    }

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}

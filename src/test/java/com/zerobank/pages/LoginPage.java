package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "signin_button")
    public WebElement signInButton;



    public  LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
}

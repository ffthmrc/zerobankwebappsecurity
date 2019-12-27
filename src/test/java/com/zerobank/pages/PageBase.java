package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    @FindBy(css = ".brand")
    @CacheLookup
    public WebElement logoBrand;

    @FindBy(id = "searchTerm")
    public WebElement searchBar;

    @FindBy(xpath = "//li[@class='dropdown'][1]")
    public WebElement settings;
    @FindBy(xpath = "//li[@class='dropdown'][2]")
    public WebElement profil;

    @FindBy(id = "account_summary_tab")
    public WebElement accountSummaryTab;

    @FindBy(id = "account_activity_tab")
    public WebElement accountActivityTab;

    @FindBy(id = "Transfer Funds")
    public WebElement transferFunds;

    @FindBy(id = "Pay Bills")
    public WebElement payBills;

    @FindBy(id = "My Money Map")
    public WebElement myMoneyMap;

    @FindBy(id = "Online Statements")
    public WebElement onlineStatement;




    public PageBase() {
        PageFactory.initElements(Driver.get(), this);
    }
}

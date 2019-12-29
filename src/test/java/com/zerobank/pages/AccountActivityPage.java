package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends PageBase {
   @FindBy(id = "aa_accountId")
   public WebElement AccountDefaultValue;

   @FindBy(xpath = "//a[text()='Find Transactions']")
   public WebElement findTransactionsButton;

   @FindBy(id = "aa_description")
   public WebElement description;

   @FindBy(id = "aa_fromDate")
   public WebElement fromDate;

   @FindBy(id = "aa_toDate")
   public WebElement toDate;

   @FindBy(xpath = "//button[@type='submit']")
   public WebElement findButton;



   public boolean accountdefaultVerify(String arg0){
       Select s = new Select(AccountDefaultValue);
       String actualvalue = s.getFirstSelectedOption().getText();
       return actualvalue.equals(arg0);
   }
public void enterDate(String fromDate , String toDate){
       this.fromDate.sendKeys(fromDate);
       this.toDate.sendKeys(toDate);

}
public void findClick(){
    this.findButton.click();
}


    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(),this);
    }
}

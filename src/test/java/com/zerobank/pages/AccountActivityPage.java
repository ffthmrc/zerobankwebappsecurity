package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends PageBase {
   @FindBy(id = "aa_accountId")
   public WebElement AccountDefaultValue;


   public boolean accountdefaultVerify(String arg0){
       Select s = new Select(AccountDefaultValue);
       String actualvalue = s.getFirstSelectedOption().getText();
       return actualvalue.equals(arg0);
   }



    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(),this);
    }
}

package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountSummaryPage extends PageBase {

   public void clickAccountButton(String arg12){
       Driver.get().findElement(By.xpath("//a[text()='"+arg12+"']")).click();
   }




    public boolean accountActivityDisplayed() {

        String AccountActivityTitle = Driver.get().getTitle();
        return AccountActivityTitle.equals("Zero - Account Activity");
    }


    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(), this);
    }


}

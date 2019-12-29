package com.zerobank.pages;

import com.zerobank.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindTransaction extends AccountActivityPage {

    @FindBy(id = "filtered_transactions_for_account")
    public List<WebElement> Dates;

    @FindBy(id = "aa_description")
    public  WebElement description;

    public void descriptionEnter(String description){
        this.description.sendKeys(description);
    }

    public boolean datesVerify() throws ParseException {
        boolean flag=true;
        int rowsize = Dates.size();
        List<String>  transactionsDates = new ArrayList<>();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> d = new ArrayList<>();
        for (int  i = 0 ; i < rowsize ; i++){
            transactionsDates.add(Driver.get().findElement(By.xpath("//div[contains(@id,'filtered')]/table/tbody/tr[\"+(i+1)+\"]/td[1]")).getText());
            d.add(date.parse(transactionsDates.get(i)));
        }
        Date dateFirst=date.parse("2012-08-31");
        Date dateLast=date.parse("2012-09-07");
        for (int i = 0; i < d.size(); i++) {
            if(!(d.get(i).after(dateFirst) && d.get(i).before(dateLast))){
                System.out.println(d.get(i));
                flag=false;
                break;
            }
        }

        for (int i=0; i<d.size()-1; i++){
            for (int j = i+1; j < d.size(); j++) {
                if(d.get(i).compareTo(d.get(j))<0){
                    flag=false;
                    System.out.println(d.get(i)+" is not more recent than "+d.get(j));
                    break;
                }
            }
        }
        return flag;

    }

    public void containsDates(String dates){

        if(Dates.contains(dates)){
            System.out.println("Yesssss");
        }

    }



    public FindTransaction(){
        PageFactory.initElements(Driver.get(),this);
    }

}

package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-lg tab'][1]")
    WebElement addCustomerTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='center']/button[2]")
    WebElement openAccountTab;

    public void setAddCustomerTab()
    {
        clickOnElement(addCustomerTab);
        log.info("Click on Add customer tab");
    }

    //click On "Open Account" Tab
    public void setOpenAccountTab()
    {
        clickOnElement(openAccountTab);
        log.info("Click on open Account Tab");
    }

}

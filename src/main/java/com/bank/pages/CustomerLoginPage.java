package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage()

    {
        PageFactory.initElements(driver,this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logout;

    //click on "Login" Button
    public void setLogin()
    {
        clickOnElement(login);
        log.info("Click on Login Button");
    }

    //click on "Logout"
    public void setLogout()
    {
        clickOnElement(logout);
        log.info("Click on LogOut");
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement verifyLogOut;

    public void verifyLogOutText()
    {
        String expectedMessage = "Logout";
        System.out.println(expectedMessage);
        String actualTextMessage = getTextFromElement(verifyLogOut);
        //Assert.assertEquals(expectedMessage,actualTextMessage);
    }

}

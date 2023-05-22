package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    public CustomersPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;
    //click on "Customer Login" Tab
    public void clickOnCustomerLoginTab()
    {
        clickOnElement(customerLogin);
        log.info("Click on customer login tab");
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement verifyCustomerName;

    public void verifyTextName()
    {
        String expectedMessage1= "Your Name";
        String actualText = getTextFromElement(verifyCustomerName);
        //Assert.assertEquals(expectedMessage1,actualText);
    }


}

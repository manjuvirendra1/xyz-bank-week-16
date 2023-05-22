package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(css = "input[placeholder='First Name']")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(css ="input[placeholder='Last Name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(css ="input[placeholder='Post Code']" )
    WebElement postCode;

    @CacheLookup
    @FindBy(css = "button[type='submit']")
    WebElement clickOnAddCustomer;

    //enter FirstName
    public void enterFirstName(String firstName)
    {
        sendTextToElement(enterFirstName , firstName);
        log.info("Enter First Name : " + firstName.toString());
    }

    //enter LastName
    public void lastName(String lastName)
    {
        sendTextToElement(lastNameField , lastName);
        log.info("Enter Last Name :" + lastName.toString());
    }

    //enter PostCode
    public void postCode(String pCode)
    {
        sendTextToElement(postCode , pCode);
        log.info("Enter PostCode :"+ pCode.toString());
    }

    //click On "Add Customer" Button
    public void clickOnAddCustomerButton()
    {
        clickOnElement(clickOnAddCustomer);
        log.info("Click on Add Customer Button ");
    }
}

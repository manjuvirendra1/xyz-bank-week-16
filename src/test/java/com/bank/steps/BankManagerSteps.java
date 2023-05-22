package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import com.bank.utilities.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BankManagerSteps {

    @Given("^I should click on 'Bank Manager Login' Tab$")
    public void iShouldClickOnBankManagerLoginTab()
    {
        new BankManagerLoginPage().clickOnBankManagerLoginTab();
    }

    @When("^I should click on Add Customer tab$")
    public void iShouldClickOnAddCustomerTab()
    {
        new HomePage().setAddCustomerTab();
    }

    @And("^I Should enter first name \"([^\"]*)\"$")
    public void iShouldEnterFirstName(String firstName)
    {
        new AddCustomerPage().enterFirstName(firstName);
    }

    @And("^I should enter last name\"([^\"]*)\"$")
    public void iShouldEnterLastName(String lastName)
    {
        new AddCustomerPage().lastName(lastName);

    }

    @And("^I should  Enter post code \"([^\"]*)\"$")
    public void iShouldEnterPostCode(String postCode)
    {
        new AddCustomerPage().postCode(postCode);

    }
    @Then("^I click on 'Add Customer' Button$")
    public void iClickOnAddCustomerButton()
    {
        new AddCustomerPage().clickOnAddCustomerButton();

    }

    @And("^I should verify message 'Customer added successfully'$")
    public void iShouldVerifyMessageCustomerAddedSuccessfully()
    {
        String expectedMessage = "Customer added successfully with customer id :6";
        String actualMessage = new Utility().getTextFromAlert();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^I click 'ok' on popup$")
    public void iClickOkOnPopup()
    {
        new Utility().alertAccept();
    }

    @When("^I should click on Open Account Tab$")
    public void iShouldClickOnOpenAccountTab()
    {
        new HomePage().setOpenAccountTab();
    }

    @And("^I should search customer that created in first test \"([^\"]*)\"$")
    public void iShouldSearchCustomerThatCreatedInFirstTest(String name)
    {
        new OpenAccountPage().searchCustomerCreatedFirstTest(name);
    }



    @And("^I should select currency 'Pound'$")
    public void iShouldSelectCurrencyPound()
    {
        new OpenAccountPage().setCurrency();

    }

    @And("^I click on 'process' button$")
    public void iClickOnProcessButton()
    {
        new OpenAccountPage().setClickOnProcess();

    }

    @Then("^I should verify message 'Account created successfully'$")
    public void iShouldVerifyMessageAccountCreatedSuccessfully()
    {
        String expectedMessage = "Account created successfully with account Number :1016";
        String actualMessage =  new Utility().getTextFromAlert();
        org.testng.Assert.assertEquals(expectedMessage,actualMessage);

    }

    @And("^I click on 'ok' button on popup$")
    public void iClickOnOkButtonOnPopup()
    {
        new Utility().alertAccept();
    }
}

package com.bank.steps;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerSteps {


    @Given("^I click on 'Customer Login' tab$")
    public void iClickOnCustomerLoginTab()
    {
        new CustomersPage().clickOnCustomerLoginTab();

    }

    @And("^I should search customer that created  \"([^\"]*)\"$")
    public void iShouldSearchCustomerThatCreated(String name)
    {
        new OpenAccountPage().searchCustomerCreatedFirstTest(name);

    }

    @And("^I click on 'Login Button'$")
    public void iClickOnLoginButton()
    {
        new CustomerLoginPage().setLogin();
    }

    @When("^I should Verify 'Logout' tab display$")
    public void iShouldVerifyLogoutTabDisplay()
    {
        new CustomerLoginPage().verifyLogOutText();
    }


    @And("^I should click on 'Logout'$")
    public void iShouldClickOnLogout()
    {
        new CustomerLoginPage().setLogout();
    }


    @Then("^I should Verify 'Your Name' text display$")
    public void iShouldVerifyYourNameTextDisplay()
    {

        new CustomersPage().verifyTextName();

    }
    @When("^I should click on 'Deposit' tab$")
    public void iShouldClickOnDepositTab()
    {
        new AccountPage().setClickOnDeposit();
    }

    @And("^I should enter amount for deposit$")
    public void iShouldEnterAmountForDeposit()
    {
        new AccountPage().setEnterAmountDeposit();
    }

    @And("^I should click on 'Deposit Button'$")
    public void iShouldClickOnDepositButton()
    {
        new AccountPage().clickONDepositButton();

    }

    @Then("^I should verify message 'Deposit Successful'$")
    public void iShouldVerifyMessageDepositSuccessful()
    {
        new AccountPage().verifyDepositText();

    }

    @When("^I should click on 'withdraw money' tab$")
    public void iShouldClickOnWithdrawMoneyTab()
    {
        new AccountPage().clickOnWithdrawTab();

    }

    @And("^I should enter amount for withdraw$")
    public void iShouldEnterAmountForWithdraw()
    {
        new AccountPage().setEnterAmountDeposit();
    }


    @And("^I should click on 'withdraw money' button$")
    public void iShouldClickOnWithdrawMoneyButton()
    {
        new AccountPage().clickOnWithdrawButton();
    }

    @Then("^I should verify message 'Transaction successfully'$")
    public void iShouldVerifyMessageTransactionSuccessfully()
    {
        new AccountPage().verifyWithdrawText();

    }

}

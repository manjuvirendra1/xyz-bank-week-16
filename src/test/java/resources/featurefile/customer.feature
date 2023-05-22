@regression
Feature: Customer Test
  As User,
  I want to login, deposit and withdraw money successfully

  Background: I should access my account
    Given     I click on 'Customer Login' tab
    And       I should search customer that created  "Hermoine Granger"
    And       I click on 'Login Button'

  @sanity
  Scenario: I should login and logout Successfully
    When    I should Verify 'Logout' tab display
    And     I should click on 'Logout'
    Then    I should Verify 'Your Name' text display

  @smoke
  Scenario: I should Deposit money Successfully
    When    I should click on 'Deposit' tab
    And     I should enter amount for deposit
    And     I should click on 'Deposit Button'
    Then    I should verify message 'Deposit Successful'

  @sanity
  Scenario: I should withdraw money successfully
    When    I should click on 'withdraw money' tab
    And     I should enter amount for withdraw
    And     I should click on 'withdraw money' button
    Then    I should verify message 'Transaction successfully'


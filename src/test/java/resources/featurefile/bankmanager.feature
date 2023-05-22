@regression
Feature: Bank Manager
  As User,
  I want to add and open customer account

  Background: I should access customer account
    Given     I should click on 'Bank Manager Login' Tab

  @smoke
  Scenario:   I should add Customer Successfully
    When      I should click on Add Customer tab
    And       I Should enter first name "Mehek"
    And       I should enter last name"Thakur"
    And       I should  Enter post code "HA0 3NZ"
    Then      I click on 'Add Customer' Button
    And       I should verify message 'Customer added successfully'
    Then      I click 'ok' on popup

  @sanity
  Scenario:     I should open Account Successfully
    When        I should click on Open Account Tab
    And         I should search customer that created in first test "Harry Potter"
    And         I should select currency 'Pound'
    And         I click on 'process' button
    Then        I should verify message 'Account created successfully'
    And         I click on 'ok' button on popup

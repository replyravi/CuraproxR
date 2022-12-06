#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LoginSlovenia
Feature: Login function for Curaprox

  Scenario Outline: Curaprox Login with email Id Slovenia Location
    Given Select Slovenia
    Given Tab Next button Slovenia
    Given Click on Sign In Slovenia
    Then Slovenia type email and password with <email> and <password>
    Then Click on Login Slovenia
    Then Click on my account in app Slovenia
    Then Click on Logout Slovenia
    
  Examples:
    |email    |password|
    |curatest+rzsa2602@morphos.is |Ringzero123 |
    
    
    
    
    
 
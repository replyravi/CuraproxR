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
@Login
Feature: Login function for Curaprox

  Scenario Outline: Curaprox Login with email Id South Africa Location
    Given Select South Africa
    Given Tab Next button
    Given Click on Sign In
    Then type email and password with <email> and <password>
    Then Click on Login 
    Then Click on three line top left side of the app
    Then Click on Logout
    
  Examples:
    |email    |password|
    |curatest+rzsa2026@morphos.is |Ringzero123 |

    

    
@LoginNetherlands

  Scenario Outline: Curaprox Login with email Id Netherlands Location
    Given Select Netherlands
    Given Tab Next button Netherlands
    Given Click on Sign In Netherlands
    Then Netherlands type email and password with <email> and <password>
    Then Click on Login Netherlands
    Then Click on my account in app Netherlands
    Then Click on Logout Netherlands
    
  Examples:
    |email    |password|
    |curatest+rzsa2602@morphos.is |Ringzero123 |
    
    
    
 
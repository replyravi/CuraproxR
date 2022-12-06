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
@HomepageOpenlink
Feature: Check all main function home page link

  Scenario Outline: Curaprox Login with email Id South Africa Location
    Given Select South Africa
    Given Tab Next button
    Given Click on Sign In
    Then type email and password with <email> and <password>
    Then Click on Login
    Given Click on Education
    Given Click on PatientCenter
    Given Click on Shop
    Then Click on My Account option for logout
     
    
      Examples:
    |email    |password|
    |curatest+rzsa310@morphos.is |Ringzero123 |
    
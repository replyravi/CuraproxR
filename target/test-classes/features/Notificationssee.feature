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

@notifications
Feature: Feature: See all notification, Verify bell Icon notification, Verify sort product function, sections and sub-sections in My Account screen and complete onboarding feature and receive CP successfully

Scenario Outline: Curaprox Login with email Id South Africa Location and verify all notification
    Given Login to Curaprox for all notification
    Given Home Screen open and navigate to notification
    Given Home Screen open and navigate to bell icon
    Given Verify all message
    Given Navigate to shop click on toothbrushes
    Given Click sorted and verify it
    Given Click on My Account and verify all sections and subsections
    Then Click on my account option and log out for notification
    
    
 
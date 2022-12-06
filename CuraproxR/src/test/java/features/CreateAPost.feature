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

@createpost
Feature: Verify that user is able to create a post/campaign from the home screen which is visible to connected patients

Scenario Outline: Curaprox Login with email Id South Africa Location and verify create a post/campaign from the home screen
    Given Login to Curaprox for create a post
    Given Home Screen open and navigate to create a post click on it
    Given Create new campaign page open and fill all the information
    Given Navigate to publish section and click on it
    Then Click on my account option and log out for create post section
    
    
 
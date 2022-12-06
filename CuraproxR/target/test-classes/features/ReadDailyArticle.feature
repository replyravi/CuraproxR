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
@DailyRead
Feature: Verify that user is able to read Daily Read articles from See All screen

Scenario Outline: Curaprox Login with email Id South Africa Location and Read Daily Article 
    Given Login to Curaprox for Read Article
    Given Home Screen open and navigate to Daily Read section
    Then Click on recant post
    Then Click on back button
    Then Click on See All
    Then Click on Daily Read See all button and click on article click
    Then Click on back button and click back button
    Then Click on my account option and log out
    
    
 
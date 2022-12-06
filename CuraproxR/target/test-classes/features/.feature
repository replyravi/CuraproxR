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
   
   @Signuptest
Feature: Sign up with Email for Country South Africa and Consumer Device Android


  
  Scenario Outline: Sign up with Email
  Given Open the curaprox consumer application and  Select the country as South Africa
    And Tab Next button
    And Click on register new practice
    Then type location in search location for Southafrica and select location
    And Click conformation location
    And Enter signup details 
    | practicename | 59877 |
    Then Enter register your account details
    And Click on I am a dental professional
    And type details more for register your account details
    | 7188 |
    #And type email and password with <email> and <password>
    And type email and password with email and password
    And Click next button
    And Accept the terms and condition
    And open gmail and conform the link 
    Then Curaprox app open and click not referal option
    And Your account iscreated metion comes then click next
    And Click skip do later
    Then Click on practice open hours
    Then Enter description and click confirm
    Then Select dental professional specialty
    And Select working hours
    Then Click on chat settings
     

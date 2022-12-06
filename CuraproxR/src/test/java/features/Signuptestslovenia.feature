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
   
 @SignuptestSlovenia
Feature: Sign up with Email for Country South Africa and Consumer Device Android

   
    Scenario Outline: Sign up with Email Slovenia
  Given Open the curaprox consumer application and  Select the country as Slovenia
    And Tab Next button Slovenia
    And Click on register new practice Slovenia
    Then type location in search location for Slovenia and select location Slovenia
    And Click conformation location Slovenia
    And Enter signup details Slovenia
    | practicename | 59877 |
    Then Enter register your account details Slovenia
    And Click on I am a dental professional Slovenia
    And type details more for register your account details Slovenia
    | 7188 |
    #And type email and password with <email> and <password>
    And type email and password with email and password Slovenia
    And Click next button Slovenia
    And Accept the terms and condition Slovenia
    And open gmail and conform the link Slovenia
    Then Curaprox app open and click not referal option Slovenia
    And Your account iscreated metion comes then click next Slovenia
    And Click skip do later Slovenia
    Then Click on practice open hours Slovenia
    Then Enter description and click confirm Slovenia
    Then Select dental professional specialty Slovenia
    And Select working hours Slovenia
    Then Click on chat settings Slovenia
   
      
      

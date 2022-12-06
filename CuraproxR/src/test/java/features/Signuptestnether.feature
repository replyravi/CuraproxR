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
   
@SignuptestNetherlands

Feature: Sign up with Email for Country South Africa and Consumer Device Android

 
    Scenario Outline: Sign up with Email Netherlands
  Given Open the curaprox consumer application and  Select the country as Netherlands
    And Tab Next button Netherlands
    And Click on register new practice Netherlands
    Then type location in search location for Netherlands and select location Netherlands
    And Click conformation location Netherlands
    And Enter signup details Netherlands
    | practicename | 59877 |
    Then Enter register your account details Netherlands
    And Click on I am a dental professional Netherlands
    And type details more for register your account details Netherlands
    | 7188 |
    #And type email and password with <email> and <password>
    And type email and password with email and password Netherlands
    And Click next button Netherlands
    And Accept the terms and condition Netherlands
    And open gmail and conform the link Netherlands
    Then Curaprox app open and click not referal option Netherlands
    And Your account iscreated metion comes then click next Netherlands
    And Click skip do later Netherlands
    Then Click on practice open hours Netherlands
    Then Enter description and click confirm Netherlands
    Then Select dental professional specialty Netherlands
    And Select working hours Netherlands
    Then Click on chat settings Netherlands

      
      

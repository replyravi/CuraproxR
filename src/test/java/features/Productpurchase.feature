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
 ##Given Click on card payment details
  ##Then Enter all payment details and click on paynow button
 ## Then Click on continue shopping
#Sample Feature Definition Template
##Then Logout to Curoprox Pro application   
@Productpurchase
Feature: Purchase product from Curaprox Pro application
  
  Scenario Outline: Login and product purchase with search function
  
  When Login to Curoprox Pro application
  Given Click on shop option in below menu bar
  Then Click on search box and search product Brush and select and product and click on it
  Then Click on buy now button
  Then Click on buy now button with quantity
  Then Scroll down till Place Order button shown the click on it
  
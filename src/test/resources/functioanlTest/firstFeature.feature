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

Feature: This feature is written to practice cucumber on letsCode.io
  

 
  Scenario: Login into letsCode 
    Given I am using Chrome browser
    And letsCode.io url is launched
    When I click on Login Button
    And Login using valid cedentials   
    Then I am able to login sucessfully
    And goto WorkSpace tab 
    And check different type of feilds at Input page
    And check what all buttons can do
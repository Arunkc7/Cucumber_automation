Feature: Search the cart

@Selenium,@Regression
Scenario: Search the cart for vegetables
Given the user is on landing the page
When user searched for Cucumber
Then "Cucumber" results are displayed


@Selenium
Scenario Outline: Search the cart for vegetables and add to cart
Given the user is on landing the page
When user searched for <Vegetable> 
And Added items to the cart
And User proceeded to checkout page
Then verify selected <Vegetable> items are displayed in checkout page

Examples:
|Vegetable|
|Brinjal|
|Brocolli|
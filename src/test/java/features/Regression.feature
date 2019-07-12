Feature: App login Regression



@Regressiontest
Scenario: Successful Home page loading 
Given User is on the Landing page
When User provides login details with user name as "Test" and password as "Test"
And click the Login button
Then the Home page is dispaly is "successfully"

@Negative_Scenarios
Scenario: Failed Home page loading 
Given User is on the Landing page
When User provides login details with user name as "Test1" and password as "Test1"
And click the Login button
Then the Home page is dispaly is "failed"

@Possitive_Scenarios
Scenario: User Signup
Given User is on the Landing page
When User clicks the Signup page
And Enter the below detais
|Arunkumar|Charles|33|707 Tamarack Way | 5714198844|
Then the Home page is dispaly is "successfully"

@Multi_test
Scenario Outline: Successful Home page loading  for multiple users
Given User is on the Landing page
When User provides login details providing user name as <Username> and password as <password>
And click the Login button
Then the Home page is dispaly is "successfully"

Examples:
|Username|password|
|Arunkumar|Charles|
|Jasmine|KP|
|Santhosh|Arunkumar|
|Sharon|Arunkumar|

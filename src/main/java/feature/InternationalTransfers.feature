Feature: InternationalTransfers validation 
@RegressionTest
Scenario: InternationalTransfers page validation

Given User is on the Home page
When User clicks InternationalTransfers link
Then User is displayed with InternationalTransfers page

@RegressionTest
Scenario: Amount page validation from Transfers now

Given User is on InternationalTransfers page
When User clicks on Transfers now button
Then User is displayed with Amount page

@RegressionTest
Scenario: Amount page validation from Buy now

Given User is on InternationalTransfers page
When User clicks on Buy now button
Then User is displayed with Amount page

@RegressionTest
Scenario: SignIn page validation from Amount page

Given User is on Amount page
When User enters amount
And User clicks on continue button
Then User is displayed with SignIn page for international Transfers





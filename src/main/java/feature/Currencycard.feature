Feature: Currency card validation 
@RegressionTest 
Scenario: Currency card validation 

	Given User is on the Home page 
	When User clicks on Travel Card 
	And User clicks on currency card 
	Then Currency card page is displayed 
	
@RegressionTest 
Scenario: Dollar card amount page validation 

	Given User is on the Currency card page 
	When User clicks on Dollar Card 
	And User clicks on order now button 
	Then amount page is displayed 
	
#@RegressionTest 
#Scenario: Euro card amount page validation 
#
#	Given User is on the Currency card page 
#	When User clicks on Euro Card 
#	And User clicks on order now button 
#	Then amount page is displayed 
	
@RegressionTest 
Scenario: SignIn page validation from Euro card 

	Given User is on amount page from Euro card 
	When User enters amount 
	And User clicks on continue button 
	Then SignIn page is displayed 
	
@RegressionTest 
Scenario: SignIn page validation from Dollar card 

	Given User is on amount page from Dollar card 
	When User enters amount 
	And User clicks on continue button 
	Then SignIn page is displayed 
	
	
@RegressionTest 
Scenario: Exchange rate validation on amount page using euro card 

	Given User is on the Home page 
	And enters value of £ "6000" 
	And clicks on Order now 
	Then amount page is displayed with currency card page exchange rate 
	
@RegressionTest 
Scenario Outline:
Exchange rate validation on amount page using euro card for different values 

	Given User is on the Home page 
	And selects "<Card Type>" 
	And enters value of get currency as "<amount>" 
	And clicks on Order now 
	Then amount page is displayed with currency card page exchange rate 
	Examples: 
		|	Card Type	|	amount	|
		|	Dollar Card	|	10000	|
		|	Dollar Card	|	60		|
		|	Euro Card	|	7500	|
		|	Euro Card	|	54		|
		
		
	
		
		
		
		
		
		
		
		

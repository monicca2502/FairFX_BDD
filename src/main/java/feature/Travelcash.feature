Feature: Travelcash validation 
@TCTest 
Scenario: Travelcash validation 

	Given User is on the Home page 
	When User clicks on Travelcash 
	Then Travelcash page is displayed 
	
	
@TCTest
Scenario: Travelcash currency validation with one example

	Given  User is on the Travelcash page 
	When  currency value is entered for different currency 
		|    $ Hong Kong Dollar    |		
	And clicks on Order now for Travelcash 
	Then order Travelcash page is displayed 
	
@TCTest
Scenario: Travelcash currency validation 

	Given  User is on the Travelcash page 
	When  currency is selected 				
		|	Currency				|	value	|
		|    $ Hong Kong Dollar    	|	20000	|
			
	And clicks on Order now for Travelcash 
	Then order Travelcash page is displayed 
	
	
	
	
	
	
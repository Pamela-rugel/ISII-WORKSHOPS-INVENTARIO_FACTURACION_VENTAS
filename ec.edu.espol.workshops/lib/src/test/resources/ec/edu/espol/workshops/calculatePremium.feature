Feature: Calculate the Base Premium Insurance 

	Scenario: The customer is a married Female between the ages of 45 and 65
 		Given The customer has 50 years old, is single and female, and her license is valid
 		When We Calculate the base premium car insurance
 		Then I should be told 200
 	
	Scenario: The customer is over 80 years old
		Given The customer has 86 years old, is single and female, and her license is valid
 		When The customer gives her age
 		Then I should be told -1

	Scenario: The customer is a 28-year-old single Male 
		Given The customer has 28 years old, is single and male, and his license is valid
		When The customer Calculates the premium car insurance
		Then I should be told 500
	
	Scenario Outline: The customer is a age between 45 and 65
		Given The customer has "<age>" years old, is married and female, and her license is valid
		When The customer calculates the premium car insurance
		Then I must be told "<answer>"

	Examples:
		| age | answer|
 		| 45  | 200   |
 		| 46  | 200   |
 		| 64  | 200   |
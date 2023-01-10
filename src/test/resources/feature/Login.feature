Feature: login process
	
	Scenario: checking username and password
		Given url should be launched
		When user enters the "<username>" and "<password>"
		
		Examples: 
		|username|password|
		|sri|23456|
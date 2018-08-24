Feature: Deal with LeafTaps Login Credentials 

Background: 
	Given Launch the browser 
	And   Load the URL 
	And   set implicitwait 
	And   maximize the page 
@smoke @sanity
Scenario Outline: CreateLead positive 
	And   enter username as <userName> 
	And   enter password as <passWord> 
	When  click the Login button 
#	Then  close the browser 
	
	Examples: 
		|userName|passWord|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
#@sanity
Scenario: 
	And   enter username as gayatri 
	And   enter password as crmsfa 
	When  click the Login button 
	But   verify error message 
	
	
	
	
	
	
	
	
	
	
	
	
	

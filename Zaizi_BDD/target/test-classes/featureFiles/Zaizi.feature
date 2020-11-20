Feature: Checking Search filed in homepage 

Scenario: Checking search filed with content
	Given user navigates to Zaizi website
	And user click search field and enter digital in the search field
	When user clicks on Putting Digital in your DNA on search results screen
	Then verify Putting digital in your DNA ttile displaying
	
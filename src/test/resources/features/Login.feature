Feature: 

	#As a user, I should be able to create a car 
	@EUG5-153
	Scenario Outline: managers can create cars
		Given user is on the login page
		And user logs in as a "store manager"
		And user navigates to "Activitites" and "Calendar Events"
		And user clicks on create calendar event button
		When user adds new calendar event information
		|Title|B20 Graduation Party|
		|Description|All B20 friends are invalid for this party!|
		And user clicks on save and close button
		Then user verifies that new calendar event is displayed:
		|Title|B20 Graduation Party|
		|Description| All B20 friends are invited for this party!|
		Examples:

		
		
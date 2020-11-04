Feature:  As a librarian, I should be able to see book records on user page
	@EUG5-170
	Scenario Outline: Book Records Page
		  Given the user is logged in as "Librarian"
		  Then the user navigates to "Books"
		  Then  the user should see Show records for "<count>" options
		
		  Examples:
		    | count |
		    | 5     |
		    | 10    |
		    | 15    |
		    | 50    |
		    | 100   |
		    | 200   |
		    | 500   |
	@EUG5-169
	Scenario: Book Records Page default
		Given the user is logged in as "Librarian"
		Then the user navigates to "Books"
		And the default records should be "10"
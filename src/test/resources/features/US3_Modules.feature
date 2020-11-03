Feature: Modules Functionality

	@EUG5-157
	Scenario: Students should have access to 2 modules
		Given the user is on the login page
		When the user login in as "Students"
		Then the user should be able to see the following modules:
			|Books        |
			|Browings Book|

	@EUG5-162
	Scenario: Librarians should have access to 3 modules
		Given the user is on the login page
		When the user login in as "Librarian"
		Then the user should be able to see the following modules:
		    |Dashboard  |
		    |Users      |
		    |Books      |
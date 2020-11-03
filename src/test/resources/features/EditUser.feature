Feature: 

	#AC:
	#
	#1. add users with all valid info. 
	# 2. Librarians able to close the add user window with "close" button
	# 3. Librarians able to edit user info.
	@EUG5-167
	Scenario: Librarian create user
		Feature : Add user features
		
		 Scenario : librarian should be able to add users from users page. 
		 Given : the user  logged in as a librarian
		 When : the user can click Add User button
		 And : the user can see Add User screen
		 And : the user can click close button
		 Then : the user can click Edit User button
		 
		 
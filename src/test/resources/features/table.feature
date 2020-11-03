Feature: 

	#As a students, I should be able to see tables with default info 
	#
	#Scenario: Table columns names
	# Then table should have following column names:
	# | Actions |
	# | ISBN | 
	# | Name |
	# | Author |
	# | Category |
	# |Year |
	@EUG5-163
	Scenario: As a students, I should be able to see tables with default info 
		Given the user logged in as a Student
		
		   Then table should have following column names:
		      | Actions     |
		      | ISBN        | 
		      | Name       |
		      | Author      |
		      | Category  |
		      |Year          |
		
		
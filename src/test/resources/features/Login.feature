@smoke
Feature: Login Functionality

  Scenario Outline: User Login Functionality
   Given the user is logged in as "<role>"
    Then the user navigates to "<page>"

    Examples:
      | role        | page      |
      | Student   | books     |
      | librarian | Dashboard |


  Scenario: Student already Logged in
    Given the user is logged in as "Student"

  Scenario: Librarian already Logged in
    Given the user is logged in as "Librarian"



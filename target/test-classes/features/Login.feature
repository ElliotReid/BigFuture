Feature: Login Functionality

  Scenario Outline: User Login Functionality
    When the user login as a <role>
    Then the user is on the <page>

    Examples:
      | role        | page      |
      | student11   | books     |
      | librarian13 | Dashboard |


  Scenario: Student already Logged in
    Given the user is logged in as "Student"

  Scenario: Librarian already Logged in
    Given the user is logged in as "Librarian"



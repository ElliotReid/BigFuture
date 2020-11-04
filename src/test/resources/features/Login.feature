Feature: Login Functionality

  Scenario Outline: User Login Functionality
    When the user login as a <role>
    Then the user is on the <page>

    Examples:
      | role        | page      |
      | student11   | books     |
      | librarian13 | Dashboard |



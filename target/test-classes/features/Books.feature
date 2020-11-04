Feature: Books Module features

Scenario: student should able to see following columns`
Given the user is logged in as "Student"
Then  the user should able to see following columns
| Actions     |
| ISBN        |
| Name        |
| Author      |
| Category    |
| Year        |
| Borrowed By |


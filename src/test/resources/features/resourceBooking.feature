Feature: As a user, I want to book recourses

  Background:
    Given user on the dashboard page, title should be "Dashboard"

  Scenario Outline: verify user able to booking the resources
    When user click the Booking module
    Then user should see below info in Booking dropdown
      | Conferance room |
      | Gym             |
      | Swimming pool   |
    When user select the "<options>"
    Then user able to see the calendar
    When user select the available date
    Then "Your booking is confirmed! Please check your Email for details" message should be displayed
    Examples:
      | options         |
      | Conferance room |
      | Gym             |
      | Swimming pool   |

  Scenario Outline: verify user not able to booking the resources with InValid date
    When user click the Booking module
    Then user should see below info in Booking dropdown
      | Conferance room |
      | Gym             |
      | Swimming pool   |
    When user select the "<options>"
    Then user able to see the calendar
    When user select the Passed date
    Then "Oops! Please select valid date." error message should be displayed
    Examples:
      | options         |
      | Conferance room |
      | Gym             |
      | Swimming pool   |








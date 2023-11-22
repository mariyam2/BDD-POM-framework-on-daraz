Feature: Testing Sauce Demo Login
  Scenario Outline: Testing Login
    Given User Logins with <usname> and <Passw>
    Then User is on Product Page
    Examples:
    |username|password|
    |03328261288|Abc123++|
    #|standard_user         |        123534    |


#hhhhhnkbkhbjhb
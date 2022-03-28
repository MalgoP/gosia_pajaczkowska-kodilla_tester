Feature: Double Cash Deposit And Withdrawal

  Scenario Outline: User checks balance of their wallet
    Given I have deposited $<deposit1> in my wallet
    When I request $<withdraw1>
    Then $<withdraw1> should be dispensed
    Given I have deposited $<deposit2> in my wallet
    When I request $<withdraw2>
    Then $<withdraw2> should be dispensed
    And the balance of my wallet should be $<balance>
    Examples:
      | deposit1 | withdraw1 | deposit2 | withdraw2 | balance |
      | 100      | 90        | 200      | 210       | 0       |
      | 100      | 90        | 200      | 10        | 200     |
      | 100      | 30        | 300      | 10        | 360     |
      | 100      | 100       | 2000     | 100       | 1900    |
      | 500      | 100       | 100      | 400       | 100     |

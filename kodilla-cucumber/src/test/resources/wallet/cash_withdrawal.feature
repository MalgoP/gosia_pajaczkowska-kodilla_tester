Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $<deposit> in my wallet
    When I request $<withdraw>
    Then $<withdraw> should be dispensed
    And the balance of my wallet should be $<balance>
    Examples:
    | deposit | withdraw | balance |
    |200      |30        |170      |

Feature: Prevent users from taking out more money than their wallet contains

  Scenario Outline: User tries to take out more money than their balance
    Given I have deposited $<deposit> in my wallet
    When I request $<withdraw>
    Then nothing should be dispensed
    And I should be told that <message>
    Examples:
      | deposit | withdraw | message |
      | 100     | 200      | "Not enough funds in the wallet"|
      | 0       | 200      | "Not enough funds in the wallet"|
      | 1       | 2        | "Not enough funds in the wallet"|

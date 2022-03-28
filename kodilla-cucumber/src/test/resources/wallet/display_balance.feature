Feature: Display balance

  Scenario Outline: User checks the balance of their wallet
    Given I have deposited $<deposit> in my wallet
    Then I check the balance of my wallet
    And I should see that the balance is $<balance>
    Examples:
      | deposit | balance |
      | 100     | 100     |
      | 200     | 200     |
      | 42300   | 42300   |
      | 12200   | 12200   |
      | 0       | 0       |

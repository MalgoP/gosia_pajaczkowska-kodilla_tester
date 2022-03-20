Feature: Is it divisible?
  Those numbers are divisible by three or five.

  Scenario Outline: The number is or isn't divisible
    Given <number>
    When I ask if it is 3 or 5 divisible
    Then Should return a result <result>
    Examples:
      | number | result     |
      |      3 | "Fizz"     |
      |      9 | "Fizz"     |
      |      5 | "Buzz"     |
      |     25 | "Buzz"     |
      |     15 | "FizzBuzz" |
      |     30 | "FizzBuzz" |
      |      2 | "None"     |
      |      7 | "None"     |
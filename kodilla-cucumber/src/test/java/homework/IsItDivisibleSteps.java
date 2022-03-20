package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleSteps implements En {
    private int number;
    private String result;

    public IsItDivisibleSteps() {
        Given("{int}", (Integer number) -> {
            this.number = number;
        });


        When("I ask if it is 3 or 5 divisible", () -> {
            this.result = DivisionChecker.checkDivisible(number);
        });

        Then("Should return a result {string}", (String expectedResult) -> {
            Assert.assertEquals(expectedResult, this.result);
        });
    }
}
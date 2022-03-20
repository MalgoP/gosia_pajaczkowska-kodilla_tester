package homework;

public class DivisionChecker {

    public static final String DIVISIBLE_BY_3_AND_5 = "FizzBuzz";
    public static final String DIVISIBLE_BY_3 = "Fizz";
    public static final String DIVISIBLE_BY_5 = "Buzz";
    public static final String NOT_DIVISIBLE_BY_3_AND_5 = "None";

    public static String checkDivisible(int number){
        boolean divisibleBy3 = number%3==0;
        boolean divisibleBy5 = number%5==0;
        if(divisibleBy3 && divisibleBy5){
            return DIVISIBLE_BY_3_AND_5;
        }
        if(divisibleBy3){
            return DIVISIBLE_BY_3;
        }
        if(divisibleBy5){
            return DIVISIBLE_BY_5;
        }
        return NOT_DIVISIBLE_BY_3_AND_5;
    }
}

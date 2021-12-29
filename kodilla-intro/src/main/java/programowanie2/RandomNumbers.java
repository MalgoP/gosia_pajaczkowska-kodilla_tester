package programowanie2;

import java.util.Random;

public class RandomNumbers {
    int minValue;
    int maxValue;
    int maxSum;
    int maxRandom;

    public RandomNumbers(int maxSum, int maxRandom) {
        this.maxSum = maxSum;
        this.maxRandom = maxRandom;
    }

    public void generateNumbers() {
        Random random = new Random();
        int sum = 0;
        minValue = maxRandom;
        maxValue = 0;
        while (sum < maxSum) {
            int randomValue = random.nextInt(maxRandom + 1);
            sum += randomValue;
            calcMaxValue(randomValue);
            calcMinValue(randomValue);

            System.out.println("randomValue " + randomValue);
            System.out.println("sum " + sum);
        }
    }

    private void calcMaxValue(int randomValue) {
        if (maxValue < randomValue) {
            maxValue = randomValue;
        }
    }

    private void calcMinValue(int randomValue) {
        if (minValue > randomValue) {
            minValue = randomValue;
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers(5000, 30);
        rn.generateNumbers();
        System.out.println("ninValue " + rn.getMinValue());
        System.out.println("maxValue " + rn.getMaxValue());
    }
}

package programowanie2;

import java.util.Random;

public class RandomNumbers {
    int minValue;
    int maxValue;
    int maxSum = 5000;
    int maxRandom = 30;

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
            if (minValue > randomValue) {
                minValue = randomValue;
            }
            if (maxValue < randomValue) {
                maxValue = randomValue;
            }
            System.out.println("randomValue " + randomValue);
            System.out.println("sum " + sum);
        }
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers(5000, 30);
        rn.generateNumbers();
        System.out.println("ninValue " + rn.getMinValue());
        System.out.println("maxValue " + rn.getMaxValue());
    }
}

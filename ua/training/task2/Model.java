package ua.training.task2;

import java.util.Random;

public class Model {
    private int min;
    private int max;
    private int goal;
    private int attempts;

    public Model() {
        Random r = new Random();

        attempts = 0;
        min = 0;
        max = 100;
        goal = r.nextInt(101);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getGoal() {
        return goal;
    }

    public int checkNumber(int number) {
        attempts++;
        if (number > goal){
            max = number - 1;
            return 1;
        }
        if (number < goal){
            min = number + 1;
            return -1;
        }
        return 0;
    }
}

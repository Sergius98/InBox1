package ua.training.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    Model model = new Model();

    @Test
    public void checkBiggerNumber() {
        assertEquals(1, model.checkNumber(model.getGoal() + 1));
        assertEquals(model.getGoal(), model.getMax());
    }

    @Test
    public void checkSmallerNumber() {
        assertEquals(-1, model.checkNumber(model.getGoal() - 1));
        assertEquals(model.getGoal(), model.getMin());
    }

    @Test
    public void checkGoalNumber() {
        Model model = new Model();
        assertEquals(0, model.checkNumber(model.getGoal()));
    }
}
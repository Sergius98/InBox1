package ua.training.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void checkNumber() {
        Model model = new Model();
        assertEquals(1, model.checkNumber(model.getGoal() + 1));
        assertEquals(1, model.getAttempts());
        assertEquals(model.getGoal() + 1, model.getMax());

        assertEquals(-1, model.checkNumber(model.getGoal() - 1));
        assertEquals(2, model.getAttempts());
        assertEquals(model.getGoal() - 1, model.getMin());

        assertEquals(0, model.checkNumber(model.getGoal()));
        assertEquals(3, model.getAttempts());
    }
}
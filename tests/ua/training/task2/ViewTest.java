package ua.training.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViewTest {
    View view = new View();

    @Test
    public void formatMessage2Args() {
        assertEquals("Input a number in range (0;100) : ",
                view.formatMessage(View.INPUT_A_NUMBER_IN_RANGE, 0, 100));
    }

    @Test
    public void formatMessage1Args() {
        assertEquals("result: 4 attempts",
                view.formatMessage(View.RESULT, 4));
    }
}
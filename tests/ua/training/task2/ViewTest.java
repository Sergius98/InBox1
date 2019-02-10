package ua.training.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViewTest {

    @Test
    public void formatMessage() {
        View view = new View();
        assertEquals("Input a number in range (0;100) : ",
                view.formatMessage(View.INPUT_A_NUMBER_IN_RANGE, 0, 100));
        assertEquals("result: 4 attempts",
                view.formatMessage(View.RESULT, 4));
    }
}
package ua.training.task5;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class ModelTest {
    int[] array = {7, 9, 3, -1, 0, 5, 1, 12, 0};
    @Test
    public void avrValue() {
        assertEquals(4, Model.avrValue(array), 0.1);
    }

    @Test
    public void indexOfMinElement() {
        assertEquals(3, Model.indexOfMinElement(array));
    }
    @Test
    public void minElement() {
        assertEquals(array[3], array[Model.indexOfMinElement(array)]);
    }

    @Test
    public void zeroCount() {
        assertEquals(2, Model.zeroCount(array));
    }

    @Test
    public void positiveCount() {
        assertEquals(6, Model.positiveCount(array));
    }

    @Test
    public void mulArray() {
        int[] multipliedValuesByTwo = {14, 18, 6, -2, 0, 10, 2, 24, 0};
        int[] testingMultipliedValuesByTwo = Model.mulArray(array, 2);
        assertArrayEquals(multipliedValuesByTwo, testingMultipliedValuesByTwo);
    }
}
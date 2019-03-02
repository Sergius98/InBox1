package ua.training.task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * Created by M on 02/07/2019
 */
public class Model {

    public static double avrValue(int[] array){
        IntStream stream = Arrays.stream(array);
        return stream.average().getAsDouble();
    }

    public static int indexOfMinElement(int[] array){
        return IntStream.range(0, array.length).boxed().min(Comparator.comparingInt(value -> array[value])).get();
    }

    public static long zeroCount(int[] array){
        IntStream stream = Arrays.stream(array);
        return stream.filter(value -> 0 == value).count();
    }

    public static long positiveCount(int[] array){
        IntStream stream = Arrays.stream(array);
        return stream.filter(value -> 0 < value).count();
    }

    public static int[] mulArray(int[] array, int number){
        IntStream stream = Arrays.stream(array);
        return stream.map(value -> value * number).toArray();
    }

}

package ua.training.task2;

public class View {
    // Text's constants
    public static final String INPUT_A_NUMBER_IN_RANGE = "Input a number in range (%d;%d) : ";
    public static final String YOUR_NUMBER_IS_TOO_LOW = "Your number is too low";
    public static final String YOUR_NUMBER_IS_TOO_HIGH = "Your number is too high";
    public static final String YOU_WON = "YOU WON!!!";
    public static final String WRONG_INPUT_NOT_NUMBER = "Wrong input: not number";
    public static final String WRONG_INPUT_WRONG_NUMBER = "Wrong input: number not in the range";
    public static final String RESULT = "result: %d attempts";


    public String formatMessage(String message, int arg1, int arg2){
        return String.format(message, arg1, arg2);
    }
    public String formatMessage(String message, int arg1){
        return String.format(message, arg1);
    }

    public void printMessage(String message, int... args){
        if (args.length >= 2){
            System.out.println(formatMessage(message, args[0], args[1]));
        } else if (args.length == 1){
            System.out.println(formatMessage(message, args[0]));
        } else {
            System.out.println(message);
        }
    }
}

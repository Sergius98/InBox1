package ua.training.task3;

public class View {
    // Text's constants
    public static final String INPUT_YOUR = "Input Your ";
    public static final String NAME = "name = ";
    public static final String SECOND_NAME = "second name = ";
    public static final String SURNAME = "surname = ";
    public static final String SORRY_CAN_YOU_TRY_AGAIN = "Sorry, can you try again?";
    public static final String YOUR_INPUT_SHOULD_MATCHES = "Your Input should matches -> ";

    public void printMessage(String... messages){
        for (int i = 0; i < messages.length; i++){
            System.out.print(messages[i]);
        }
        System.out.print("\n");
    }
}

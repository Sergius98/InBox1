package ua.training.task3;

public class View {
    // Text's constants
    public static final String INPUT_YOUR = "Input Your ";

    public static final String NAME = "name = ";
    public static final String SECOND_NAME = "second name = ";
    public static final String SURNAME = "surname = ";

    public static final String SHORT_FULL_NAME = "short full name(Surname N.) = ";
    public static final String NICKNAME = "nickname = ";
    public static final String COMMENT = "comment(max 40 characters) = ";

    public static final String GROUPS = "groups(in upper case) = ";
    public static final String CITY_PHONE_NUMBER = "city phone number = ";
    public static final String MOBILE_PHONE_NUMBER = "mobile phone number = ";
    public static final String MOBILE_PHONE_NUMBER_2 = "mobile phone number 2(optional) = ";

    public static final String SORRY_CAN_YOU_TRY_AGAIN = "Sorry, can you try again?";
    public static final String YOUR_INPUT_SHOULD_MATCHES = "Your Input should matches -> ";

    public void printMessage(String... messages){
        for (String message : messages){
            System.out.print(message);
        }
        System.out.print("\n");
    }
}

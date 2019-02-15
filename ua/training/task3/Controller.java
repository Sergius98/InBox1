package ua.training.task3;

import java.util.Scanner;

public class Controller {
    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        boolean won = false;

        model.setName(inputRegExStringWithScanner(Constants.NAME_REG_EX, View.NAME, sc));
        model.setSecondName(inputRegExStringWithScanner(Constants.SECOND_NAME_REG_EX, View.SECOND_NAME, sc));
        model.setSurname(inputRegExStringWithScanner(Constants.SURNAME_REG_EX, View.SURNAME, sc));

        model.setShortFullName(inputRegExStringWithScanner(Constants.SHORT_FULL_NAME_REG_EX, View.SHORT_FULL_NAME, sc));
        model.setNickname(inputRegExStringWithScanner(Constants.NICKNAME_REG_EX, View.NICKNAME, sc));
        model.setComment(inputRegExStringWithScanner(Constants.COMMENT_REG_EX, View.COMMENT, sc));

        model.setGroups(inputRegExStringWithScanner(Constants.GROUPS_REG_EX, View.GROUPS, sc));
        model.setCityPhoneNumber(inputRegExStringWithScanner(Constants.CITY_PHONE_NUMBER_REG_EX, View.CITY_PHONE_NUMBER, sc));
        model.setMobilePhoneNumber(inputRegExStringWithScanner(Constants.MOBILE_PHONE_NUMBER_REG_EX, View.MOBILE_PHONE_NUMBER, sc));
        model.setMobilePhoneNumber2(inputRegExStringWithScanner(Constants.MOBILE_PHONE_NUMBER_2_REG_EX, View.MOBILE_PHONE_NUMBER_2, sc));

        model.setEmail(inputRegExStringWithScanner(Constants.EMAIL_REG_EX, View.EMAIL, sc));
        model.setSkype(inputRegExStringWithScanner(Constants.SKYPE_REG_EX, View.SKYPE, sc));

        //print
        view.printMessage(View.NAME, model.getName());
        view.printMessage(View.SECOND_NAME, model.getSecondName());
        view.printMessage(View.SURNAME, model.getSurname());

        view.printMessage(View.SHORT_FULL_NAME, model.getShortFullName());
        view.printMessage(View.NICKNAME, model.getNickName());
        view.printMessage(View.COMMENT, model.getComment());

        view.printMessage(View.GROUPS, model.getGroups());
        view.printMessage(View.CITY_PHONE_NUMBER, model.getCityPhoneNumber());
        view.printMessage(View.MOBILE_PHONE_NUMBER, model.getMobilePhoneNumber());
        view.printMessage(View.MOBILE_PHONE_NUMBER_2, model.getMobilePhoneNumber2());

        view.printMessage(View.EMAIL, model.getEmail());
        view.printMessage(View.SKYPE, model.getSkype());
    }

    // The Utility methods
    private String inputRegExStringWithScanner(String RegEx, String fieldName, Scanner sc){
        view.printMessage(View.INPUT_YOUR, fieldName);
        String line = sc.nextLine();

        while (!line.matches(RegEx)) {
            view.printMessage(View.SORRY_CAN_YOU_TRY_AGAIN);
            view.printMessage(View.YOUR_INPUT_SHOULD_MATCHES, RegEx);
            view.printMessage(View.INPUT_YOUR, fieldName);
            line = sc.nextLine();
        }
        return line;
    }
}

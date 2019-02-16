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

        model.getRecord().setName(inputRegExStringWithScanner(Constants.NAME_REG_EX, View.NAME, sc));
        model.getRecord().setSecondName(inputRegExStringWithScanner(Constants.SECOND_NAME_REG_EX, View.SECOND_NAME, sc));
        model.getRecord().setSurname(inputRegExStringWithScanner(Constants.SURNAME_REG_EX, View.SURNAME, sc));

        //model.setShortFullName(inputRegExStringWithScanner(Constants.SHORT_FULL_NAME_REG_EX, View.SHORT_FULL_NAME, sc));
        model.getRecord().setNickname(inputRegExStringWithScanner(Constants.NICKNAME_REG_EX, View.NICKNAME, sc));
        model.getRecord().setComment(inputRegExStringWithScanner(Constants.COMMENT_REG_EX, View.COMMENT, sc));

        model.getRecord().setGroups(inputRegExStringWithScanner(Constants.GROUPS_REG_EX, View.GROUPS, sc));
        model.getRecord().setCityPhoneNumber(inputRegExStringWithScanner(Constants.CITY_PHONE_NUMBER_REG_EX, View.CITY_PHONE_NUMBER, sc));
        model.getRecord().setMobilePhoneNumber(inputRegExStringWithScanner(Constants.MOBILE_PHONE_NUMBER_REG_EX, View.MOBILE_PHONE_NUMBER, sc));
        model.getRecord().setMobilePhoneNumber2(inputRegExStringWithScanner(Constants.MOBILE_PHONE_NUMBER_2_REG_EX, View.MOBILE_PHONE_NUMBER_2, sc));

        model.getRecord().setEmail(inputRegExStringWithScanner(Constants.EMAIL_REG_EX, View.EMAIL, sc));
        model.getRecord().setSkype(inputRegExStringWithScanner(Constants.SKYPE_REG_EX, View.SKYPE, sc));

        model.getRecord().setPostCode(inputRegExStringWithScanner(Constants.POST_CODE_REG_EX, View.POST_CODE, sc));
        model.getRecord().setCity(inputRegExStringWithScanner(Constants.CITY_REG_EX, View.CITY, sc));
        model.getRecord().setStreet(inputRegExStringWithScanner(Constants.STREET_REG_EX, View.STREET, sc));
        model.getRecord().setHouse(inputRegExStringWithScanner(Constants.HOUSE_REG_EX, View.HOUSE, sc));
        model.getRecord().setAppartment(inputRegExStringWithScanner(Constants.APPARTMENT_REG_EX, View.APPARTMENT, sc));

        //print
        view.printMessage(View.NAME, model.getRecord().getName());
        view.printMessage(View.SECOND_NAME, model.getRecord().getSecondName());
        view.printMessage(View.SURNAME, model.getRecord().getSurname());

        //view.printMessage(View.SHORT_FULL_NAME, model.getShortFullName());
        view.printMessage(View.NICKNAME, model.getRecord().getNickname());
        view.printMessage(View.COMMENT, model.getRecord().getComment());

        view.printMessage(View.GROUPS, model.getRecord().getGroups());
        view.printMessage(View.CITY_PHONE_NUMBER, model.getRecord().getCityPhoneNumber());
        view.printMessage(View.MOBILE_PHONE_NUMBER, model.getRecord().getMobilePhoneNumber());
        view.printMessage(View.MOBILE_PHONE_NUMBER_2, model.getRecord().getMobilePhoneNumber2());

        view.printMessage(View.EMAIL, model.getRecord().getEmail());
        view.printMessage(View.SKYPE, model.getRecord().getSkype());

        view.printMessage(View.POST_CODE, model.getRecord().getPostCode());
        view.printMessage(View.CITY, model.getRecord().getCity());
        view.printMessage(View.STREET, model.getRecord().getStreet());
        view.printMessage(View.HOUSE, model.getRecord().getHouse());
        view.printMessage(View.APPARTMENT, model.getRecord().getAppartment());
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

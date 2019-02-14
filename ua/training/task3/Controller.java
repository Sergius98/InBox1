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

        view.printMessage(View.NAME, model.getName());
        view.printMessage(View.SECOND_NAME, model.getSecondName());
        view.printMessage(View.SURNAME, model.getSurname());
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

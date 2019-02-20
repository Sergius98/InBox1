package ua.training.task4;

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
        boolean correct;
        model.setName(inputRegExStringWithScanner(Constants.NAME_REG_EX, View.NAME, sc));
        do {
            correct = true;
            try{
                model.setLogin(inputRegExStringWithScanner(Constants.LOGIN_REG_EX, View.LOGIN, sc));
            } catch (ExistedLoginException ex) {
                view.printMessage(ex.getMessage());
                correct = false;
            }
        } while (!correct);

        //print
        view.printMessage(View.NAME, model.getRecord().getName());
        view.printMessage(View.LOGIN, model.getRecord().getLogin());
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

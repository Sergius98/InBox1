package ua.training.task2;

import java.util.Objects;
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
        while(!won) {
            int number = inputIntValueWithScanner(sc);
            switch (model.checkNumber(number)){
                case -1: view.printMessage(View.YOUR_NUMBER_IS_TOO_LOW);
                    break;
                case 1: view.printMessage(View.YOUR_NUMBER_IS_TOO_HIGH);
                    break;
                case 0: view.printMessage(View.YOU_WON);
                    won = true;
                    break;
            }
        }
        view.printMessage(View.RESULT, model.getAttempts());
    }

    // The Utility methods
    private int inputIntValueWithScanner (Scanner sc){
        int number;
        while (true) {
            view.printMessage(View.INPUT_A_NUMBER_IN_RANGE, model.getMin(), model.getMax());
            while (!sc.hasNextInt()){
                view.printMessage(View.WRONG_INPUT_NOT_NUMBER);
                view.printMessage(View.INPUT_A_NUMBER_IN_RANGE, model.getMin(), model.getMax());
                sc.next();
            }
            number = sc.nextInt();
            if (number > model.getMax() || number < model.getMin()){
                view.printMessage(View.WRONG_INPUT_WRONG_NUMBER);
            } else {
                break;
            }
        }
        return number;
    }
}

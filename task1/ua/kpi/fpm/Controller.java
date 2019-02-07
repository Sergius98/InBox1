package task1.ua.kpi.fpm;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by M on 02/07/2019
 */
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

        model.setValue(inputStringWithScanner("Hello", View.INPUT_HELLO_STRING, sc));
        model.concatenateStrings(inputStringWithScanner("world!", View.INPUT_WORLD_STRING, sc));

        view.printMessage(view.OUR_STRING + "\"" + model.getValue() + "\"");
    }

    // The Utility methods
    public String inputStringWithScanner(String str, String msg, Scanner sc) {
    	String input;
        view.printMessage(msg);
        input = sc.nextLine();
        while(!Objects.equals(str, input)) {
            view.printMessage(View.WRONG_INPUT_STRING_DATA + msg);
            input = sc.nextLine();
        }
        return input;
    }
}

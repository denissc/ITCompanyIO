package com.denissc.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class that represents console view that renders, handles user input and can set next view to render
 */
public abstract class ConsoleView implements View {
    private ConsoleView nextView;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    protected void setNextView(ConsoleView nextView) {
        this.nextView = nextView;
    }

    /**
     * Renders view template to the console
     * than handles user input view action
     * and shows next view if it is set
     */
    public void render() {
        System.out.println("-------------------------------<>");
        System.out.println("|");
        System.out.println("| ITCompany CRUD app");
        System.out.println("|");
        System.out.println("-------------------------------<>");
        template();
        System.out.print("Select action: ");
        handleInput();
        if (nextView != null)
            nextView.render();
    }

    /**
     * Reads user input line
     * @return user input line string
     */
    protected String getUserInput() {
        String s;
        do {
            try {
                s = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println("Failed to read Line.");
                s = null;
            }
        }
        while (s == null);

        return s;
    }

    /**
     * Reads user input line string integer
     * @return user input number
     */
    protected int getUserIntInput(){
        int intInput = 0;
        boolean isInt = false;
        do {
            String input = getUserInput();
            try {
                intInput = Integer.parseInt(input);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number input.");
            }

        } while (! isInt);

        return intInput;
    }

    /**
     * Handles user input by reading input string and processing input
     */
    private void handleInput() {
        String input = getUserInput();
        processInput(input);
    }

    /**
     * Renders view template to the console
     */
    protected abstract void template();

    /**
     * Processes user input string
     * @param input user input string
     */
    protected abstract void processInput(String input);
}

package com.denissc.views;

import com.denissc.controllers.ConsoleController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by denissc on 05.08.17.
 */
public abstract class ConsoleView implements View {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void render() {
        System.out.println("\nITCompany app by denissc\n");
        template();
        System.out.print("Select action: ");
        handleInput();
    }

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

    private void handleInput() {
        String input = getUserInput();
        processInput(input);
    }

    protected abstract void template();

    protected abstract void processInput(String input);
}

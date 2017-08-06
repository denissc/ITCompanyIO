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
                e.printStackTrace();
                System.out.println("Failed to read Line.");
                s = null;
            }
        }
        while (s == null);

        return s;
    }

    private void handleInput() {
        String input = getUserInput();
        processInput(input);
    }

    protected abstract void template();

    protected abstract void processInput(String input);
}

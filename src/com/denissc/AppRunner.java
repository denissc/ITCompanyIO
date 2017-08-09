package com.denissc;

import com.denissc.views.MainMenuView;

public class AppRunner {

    public static void main(String[] args) {
        ConsoleApp consoleApp = new ConsoleApp(new MainMenuView());
        consoleApp.run();
    }
}

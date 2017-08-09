package com.denissc;

import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 05.08.17.
 */
public class ConsoleApp {
    ConsoleView mainView;

    public ConsoleApp(ConsoleView mainView) {
        this.mainView = mainView;
    }

    public void run(){
        mainView.render();
    }
}

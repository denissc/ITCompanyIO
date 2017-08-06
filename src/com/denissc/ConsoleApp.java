package com.denissc;

import com.denissc.views.ConsoleView;
import com.denissc.views.MainMenuView;

/**
 * Created by denissc on 05.08.17.
 */
public class ConsoleApp {
    ConsoleView menu = new MainMenuView();


    public void run(){
        menu.render();
    }
}

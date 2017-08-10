package com.denissc;

import com.denissc.views.ConsoleView;
import com.denissc.views.menu.MenuViewFactory;

/**
 * Created by denissc on 05.08.17.
 */
public class ConsoleApp {
    MenuViewFactory menuViewFactory  = new MenuViewFactory();

    public void run(){
        menuViewFactory.getMenuView().render();
    }
}

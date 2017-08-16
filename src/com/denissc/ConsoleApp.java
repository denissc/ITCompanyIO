package com.denissc;

import com.denissc.views.menu.MenuViewFactory;

public class ConsoleApp {
    MenuViewFactory menuViewFactory  = new MenuViewFactory();

    public void run(){
        menuViewFactory.getMenuView().render();
    }
}

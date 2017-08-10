package com.denissc.views.menu;

import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 10.08.17.
 */
public class MenuViewFactory {
    public ConsoleView getMenuView() {
        return new MainMenuView();
    }
}

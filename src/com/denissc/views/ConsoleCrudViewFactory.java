package com.denissc.views;

/**
 * Created by denissc on 06.08.17.
 */
public interface ConsoleCrudViewFactory {
    ConsoleView getListView();
    ConsoleView getCreateView();
    ConsoleView getEditView();
    ConsoleView getDeleteView();
    ConsoleView getShowView();
}

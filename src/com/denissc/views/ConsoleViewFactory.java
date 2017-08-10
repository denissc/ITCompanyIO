package com.denissc.views;

/**
 * Created by denissc on 06.08.17.
 */
public interface ConsoleViewFactory {
    ConsoleView getListView();
    ConsoleView getCreateView();
    ConsoleView getEditView();
    ConsoleView getDeleteView();
    ConsoleView getShowView();
}

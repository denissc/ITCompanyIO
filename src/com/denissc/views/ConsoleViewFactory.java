package com.denissc.views;

/**
 * Console view factory for CRUD operations
 */
public interface ConsoleViewFactory {
    ConsoleView getListView();
    ConsoleView getCreateView();
    ConsoleView getEditView();
    ConsoleView getDeleteView();
    ConsoleView getShowView();
}

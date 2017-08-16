package com.denissc.views.customers;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;
import com.denissc.views.menu.MenuViewFactory;

/**
 * Creates customer views
 */
public class CustomerViewFactory extends MenuViewFactory implements ConsoleViewFactory {
    @Override
    public CustomerView getListView() {
        return new CustomerListView();
    }

    @Override
    public CustomerView getCreateView() {
        return new CustomerCreateView();
    }

    @Override
    public CustomerView getEditView() {
        return new CustomerEditView();
    }

    @Override
    public CustomerView getDeleteView() {
        return new CustomerDeleteView();
    }

    @Override
    public CustomerView getShowView() {
        return new CustomerShowView();
    }
}

package com.denissc.views.customers;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 08.08.17.
 */
public class CustomerViewFactory implements ConsoleViewFactory {
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

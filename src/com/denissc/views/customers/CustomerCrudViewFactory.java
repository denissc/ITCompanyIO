package com.denissc.views.customers;

import com.denissc.views.ConsoleCrudViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 08.08.17.
 */
public class CustomerCrudViewFactory implements ConsoleCrudViewFactory {
    @Override
    public ConsoleView getListView() {
        return new CustomerListView();
    }

    @Override
    public ConsoleView getCreateView() {
        return new CustomerCreateView();
    }

    @Override
    public ConsoleView getEditView() {
        return new CustomerEditView();
    }

    @Override
    public ConsoleView getDeleteView() {
        return new CustomerDeleteView();
    }

    @Override
    public ConsoleView getShowView() {
        return new CustomerShowView();
    }
}

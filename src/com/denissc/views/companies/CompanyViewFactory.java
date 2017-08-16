package com.denissc.views.companies;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.menu.MenuViewFactory;

/**
 * Creates company views
 */
public class CompanyViewFactory extends MenuViewFactory implements ConsoleViewFactory {

    @Override
    public CompanyView getListView() {
        return new CompanyListView();
    }

    @Override
    public CompanyView getCreateView() {
        return new CompanyCreateView();
    }

    @Override
    public CompanyView getEditView() {
        return new CompanyEditView();
    }

    @Override
    public CompanyView getDeleteView() {
        return new CompanyDeleteView();
    }

    @Override
    public CompanyView getShowView() {
        return new CompanyShowView();
    }
}

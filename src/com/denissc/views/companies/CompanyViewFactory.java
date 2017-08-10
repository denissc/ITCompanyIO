package com.denissc.views.companies;

import com.denissc.views.ConsoleViewFactory;

/**
 * Created by denissc on 06.08.17.
 */
public class CompanyViewFactory implements ConsoleViewFactory {

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

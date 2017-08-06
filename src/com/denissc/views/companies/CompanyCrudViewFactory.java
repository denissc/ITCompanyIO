package com.denissc.views.companies;

import com.denissc.views.ConsoleCrudViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 06.08.17.
 */
public class CompanyCrudViewFactory implements ConsoleCrudViewFactory {

    @Override
    public ConsoleView getListView() {
        return new CompaniesListView();
    }

    @Override
    public ConsoleView getCreateView() {
        return new CompanyCreateView();
    }

    @Override
    public ConsoleView getEditView() {
        return new CompanyEditView();
    }

    @Override
    public ConsoleView getDeleteView() {
        return new CompanyDeleteView();
    }

    @Override
    public ConsoleView getShowView() {
        return new CompanyShowView();
    }
}

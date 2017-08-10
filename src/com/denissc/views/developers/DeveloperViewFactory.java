package com.denissc.views.developers;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 08.08.17.
 */
public class DeveloperViewFactory implements ConsoleViewFactory {
    @Override
    public DeveloperView getListView() {
        return new DeveloperListView();
    }

    @Override
    public DeveloperView getCreateView() {
        return new DeveloperCreateView();
    }

    @Override
    public DeveloperView getEditView() {
        return new DeveloperEditView();
    }

    @Override
    public DeveloperView getDeleteView() {
        return new DeveloperDeleteView();
    }

    @Override
    public DeveloperView getShowView() {
        return new DeveloperShowView();
    }
}

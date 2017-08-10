package com.denissc.views.projects;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 08.08.17.
 */
public class ProjectViewFactory implements ConsoleViewFactory {
    @Override
    public ConsoleView getListView() {
        return new ProjectListView();
    }

    @Override
    public ConsoleView getCreateView() {
        return new ProjectCreateView();
    }

    @Override
    public ConsoleView getEditView() {
        return new ProjectEditView();
    }

    @Override
    public ConsoleView getDeleteView() {
        return new ProjectDeleteView();
    }

    @Override
    public ConsoleView getShowView() {
        return new ProjectShowView();
    }
}

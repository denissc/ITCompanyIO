package com.denissc.views.projects;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.menu.MenuViewFactory;

/**
 * Creates project views
 */
public class ProjectViewFactory extends MenuViewFactory implements ConsoleViewFactory {
    @Override
    public ProjectView getListView() {
        return new ProjectListView();
    }

    @Override
    public ProjectView getCreateView() {
        return new ProjectCreateView();
    }

    @Override
    public ProjectView getEditView() {
        return new ProjectEditView();
    }

    @Override
    public ProjectView getDeleteView() {
        return new ProjectDeleteView();
    }

    @Override
    public ProjectView getShowView() {
        return new ProjectShowView();
    }
}

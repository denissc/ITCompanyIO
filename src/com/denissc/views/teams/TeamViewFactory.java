package com.denissc.views.teams;

import com.denissc.views.ConsoleViewFactory;

/**
 * Created by denissc on 08.08.17.
 */
public class TeamViewFactory implements ConsoleViewFactory {
    @Override
    public TeamView getListView() {
        return new TeamListView();
    }

    @Override
    public TeamView getCreateView() {
        return new TeamCreateView();
    }

    @Override
    public TeamView getEditView() {
        return new TeamEditView();
    }

    @Override
    public TeamView getDeleteView() {
        return new TeamDeleteView();
    }

    @Override
    public TeamView getShowView() {
        return new TeamShowView();
    }
}

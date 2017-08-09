package com.denissc.views.teams;

import com.denissc.views.ConsoleCrudViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 08.08.17.
 */
public class TeamCrudViewFactory implements ConsoleCrudViewFactory {
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

package com.denissc.views.teams;

import com.denissc.controllers.TeamController;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 09.08.17.
 */
public abstract class TeamView extends ConsoleView {
    TeamController controller = new TeamController();
    TeamCrudViewFactory viewFactory = new TeamCrudViewFactory();
}

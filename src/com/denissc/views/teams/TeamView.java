package com.denissc.views.teams;

import com.denissc.controllers.TeamController;
import com.denissc.views.ConsoleView;

/**
 * Class that compose team controller to view
 */
abstract class TeamView extends ConsoleView {
    TeamController controller = new TeamController();
    TeamViewFactory teamViewFactory = new TeamViewFactory();
}

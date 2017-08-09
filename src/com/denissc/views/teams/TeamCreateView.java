package com.denissc.views.teams;

import com.denissc.models.Team;

/**
 * Created by denissc on 09.08.17.
 */
public class TeamCreateView extends TeamView {
    private int teamId;
    private int projectId;
    private String teamName;

    @Override
    protected void template() {
        System.out.println("Main > Teams > create");
        System.out.println("Inset Team data: ");
        System.out.println("\n======================\n");
        System.out.println("Team ID :");
        teamId = getUserIntInput();
        System.out.println("Project ID :");
        projectId = getUserIntInput();
        System.out.println("Team name : ");
        teamName = getUserInput();
        System.out.println("1 - create, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.create(new Team(teamId, projectId, teamName));
                render();
                break;
            case "2":
                viewFactory.getListView().render();
            case "quit":
                break;
            default:
                render();
        }
    }
}

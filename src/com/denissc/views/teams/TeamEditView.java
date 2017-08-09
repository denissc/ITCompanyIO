package com.denissc.views.teams;

import com.denissc.models.Team;

/**
 * Created by denissc on 09.08.17.
 */
public class TeamEditView extends TeamView {
    private int teamId;
    private int projectId;
    private String teamName;

    @Override
    protected void template() {
        System.out.println("Main > Teams > edit");
        System.out.println("Inset Team data: ");
        System.out.println("\n======================\n");
        System.out.println("Team ID :");
        teamId = getUserIntInput();
        System.out.println("New project ID :");
        projectId = getUserIntInput();
        System.out.println("New team name : ");
        teamName = getUserInput();
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Team(teamId, projectId, teamName));
                render();
                break;
            case "2":
                viewFactory.getListView().render();
                break;
            case "quit":
                break;
            default:
                render();
        }
    }
}

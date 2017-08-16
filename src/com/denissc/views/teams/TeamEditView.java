package com.denissc.views.teams;

import com.denissc.models.Team;

/**
 * Team edit view template
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
        System.out.println("\n=====================\n");
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Team(teamId, projectId, teamName));
                setNextView(this);
                break;
            case "2":
                setNextView(teamViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

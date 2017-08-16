package com.denissc.views.teams;

import com.denissc.models.Team;

import java.util.Set;

/**
 * Displays team list
 */
public class TeamListView extends TeamView {
    protected void template() {
        System.out.println("Main > Teams");
        System.out.println("Team List : ");
        System.out.println("\n=====================\n");
        Set<Team> teams = controller.findAll();
        if (teams.size() > 0) {
            for (Team team :
                    teams) {
                System.out.println(team);
            }
        } else {
            System.out.println("No teams found here yet.");
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                setNextView(teamViewFactory.getCreateView());
                break;
            case "2":
                setNextView(teamViewFactory.getShowView());
                break;
            case "3":
                setNextView(teamViewFactory.getEditView());
                break;
            case "4":
                setNextView(teamViewFactory.getDeleteView());
                break;
            case "5":
                setNextView(teamViewFactory.getMenuView());
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

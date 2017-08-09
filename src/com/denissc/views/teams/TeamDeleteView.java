package com.denissc.views.teams;

import com.denissc.models.Team;

/**
 * Created by denissc on 09.08.17.
 */
public class TeamDeleteView extends TeamView {
    private int teamId;

    @Override
    protected void template() {
        System.out.println("Main > Teams > delete");
        System.out.println("Inset Team ID: ");
        System.out.println("\n======================\n");
        System.out.print("Team ID : ");
        teamId = getUserIntInput();
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Team(teamId));
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

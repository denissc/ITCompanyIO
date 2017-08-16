package com.denissc.views.developers;

import com.denissc.models.Developer;

/**
 * Handles create developer process
 */
public class DeveloperCreateView extends DeveloperView {
    private int developerId;
    private int teamId;
    private String developerName;
    private String developerOccupation;

    @Override
    protected void template() {
        System.out.println("Main > Developers > create");
        System.out.println("Inset Developer data: ");
        System.out.println("\n======================\n");
        System.out.println("Developer ID :");
        developerId = getUserIntInput();
        System.out.println("Team ID :");
        teamId = getUserIntInput();
        System.out.println("Developer name : ");
        developerName = getUserInput();
        System.out.println("Developer occupation : ");
        developerOccupation = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.create(new Developer(developerId, teamId, developerName, developerOccupation));
                setNextView(this);
                break;
            case "2":
                setNextView(developerViewFactory.getListView());
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

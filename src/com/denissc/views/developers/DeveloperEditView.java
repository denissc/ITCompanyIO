package com.denissc.views.developers;

import com.denissc.models.Developer;

/**
 * Handles edit developer process
 */
public class DeveloperEditView extends DeveloperView {
    private int developerId;
    private int teamId;
    private String developerName;
    private String developerOccupation;

    @Override
    protected void template() {
        System.out.println("Main > Developers > edit");
        System.out.println("Inset Developer data: ");
        System.out.println("\n======================\n");
        System.out.println("Developer ID :");
        developerId = getUserIntInput();
        System.out.println("New Team ID :");
        teamId = getUserIntInput();
        System.out.println("New Developer name : ");
        developerName = getUserInput();
        System.out.println("New Developer occupation : ");
        developerOccupation = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Developer(developerId, teamId, developerName, developerOccupation));
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

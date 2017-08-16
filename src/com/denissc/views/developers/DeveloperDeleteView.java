package com.denissc.views.developers;

import com.denissc.models.Developer;

/**
 * Handles delete developer process
 */
public class DeveloperDeleteView extends DeveloperView {
    private int developerId;

    @Override
    protected void template() {
        System.out.println("Main > Developers > delete");
        System.out.println("Inset Developer ID: ");
        System.out.println("\n======================\n");
        System.out.print("Developer ID :");
        developerId = getUserIntInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Developer(developerId));
                setNextView(this);
                break;
            case "2":
                setNextView(developerViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

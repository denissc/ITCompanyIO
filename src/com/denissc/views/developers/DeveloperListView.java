package com.denissc.views.developers;

import com.denissc.models.Developer;

import java.util.Set;

/**
 * Displays developer list
 */
public class DeveloperListView extends DeveloperView {
    protected void template() {
        System.out.println("Main > Developers");
        System.out.println("Developers List : ");
        System.out.println("\n=====================\n");
        Set<Developer> developers = controller.findAll();
        if (developers.size() > 0) {
            for (Developer developer :
                    developers) {
                System.out.println(developer);
            }
        } else {
            System.out.println("No developers found here yet.");
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                setNextView(developerViewFactory.getCreateView());
                break;
            case "2":
                setNextView(developerViewFactory.getShowView());
                break;
            case "3":
                setNextView(developerViewFactory.getEditView());
                break;
            case "4":
                setNextView(developerViewFactory.getDeleteView());
                break;
            case "5":
                setNextView(developerViewFactory.getMenuView());
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

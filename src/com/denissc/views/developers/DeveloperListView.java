package com.denissc.views.developers;

import com.denissc.models.Developer;

import java.util.Set;

/**
 * Created by denissc on 10.08.17.
 */
public class DeveloperListView extends DeveloperView {
    protected void template() {
        System.out.println("Main > Developers");
        System.out.println("Developers List : ");
        System.out.println("\n=====================\n");
        Set<Developer> developers = controller.findAll();
        if (developers != null) {
            for (Developer developer :
                    developers) {
                System.out.println(developer);
            }
        } else {
            System.out.println("No developers found here yet.");
        }

        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                viewFactory.getCreateView().render();
                break;
            case "2":
                viewFactory.getShowView().render();
                break;
            case "3":
                viewFactory.getEditView().render();
                break;
            case "4":
                viewFactory.getDeleteView().render();
                break;
            case "5":
                menuViewFactory.getMenuView().render();
            case "quit":
                break;
            default:
                render();

        }
    }
}
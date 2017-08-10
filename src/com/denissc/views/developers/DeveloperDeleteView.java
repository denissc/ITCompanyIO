package com.denissc.views.developers;

import com.denissc.models.Customer;
import com.denissc.models.Developer;

/**
 * Created by denissc on 10.08.17.
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
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Developer(developerId));
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

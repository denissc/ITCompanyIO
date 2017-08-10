package com.denissc.views.teams;

import com.denissc.models.Team;
import com.denissc.views.menu.MainMenuView;

import java.util.Set;

/**
 * Created by denissc on 09.08.17.
 */
public class TeamListView extends TeamView {
    protected void template() {
        System.out.println("Main > Teams");
        System.out.println("Team List : ");
        System.out.println("\n=====================\n");
        Set<Team> projects = controller.findAll();
        if (projects != null) {
            for (Team project :
                    projects) {
                System.out.println(project);
            }
        } else {
            System.out.println("No teams found here yet.");
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

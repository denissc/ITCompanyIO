package com.denissc.views.projects;

import com.denissc.models.Project;
import com.denissc.views.ConsoleView;
import com.denissc.views.MainMenuView;

import java.util.Set;

/**
 * Created by denissc on 09.08.17.
 */
public class ProjectListView extends ProjectView{
    protected void template() {
        System.out.println("Main > Projects");
        System.out.println("Project List : ");
        System.out.println("\n=====================\n");
        Set<Project> projects = controller.findAll();
        if (projects != null) {
            for (Project project :
                    projects) {
                System.out.println(project);
            }
        } else {
            System.out.println("No projects found here yet.");
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
                new MainMenuView().render();
            case "quit":
                break;
            default:
                render();

        }
    }
}

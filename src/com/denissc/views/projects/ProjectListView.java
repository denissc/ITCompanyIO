package com.denissc.views.projects;

import com.denissc.models.Project;

import java.util.Set;

/**
 * Displays project list
 */
public class ProjectListView extends ProjectView{
    protected void template() {
        System.out.println("Main > Projects");
        System.out.println("Project List : ");
        System.out.println("\n=====================\n");
        Set<Project> projects = controller.findAll();
        if (projects.size() > 0) {
            for (Project project :
                    projects) {
                System.out.println(project);
            }
        } else {
            System.out.println("No projects found here yet.");
        }

        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                setNextView(projectViewFactory.getCreateView());
                break;
            case "2":
                setNextView(projectViewFactory.getShowView());
                break;
            case "3":
                setNextView(projectViewFactory.getEditView());
                break;
            case "4":
                setNextView(projectViewFactory.getDeleteView());
                break;
            case "5":
                setNextView(projectViewFactory.getMenuView());
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

package com.denissc.views.projects;

import com.denissc.models.Project;

/**
 * Handle delete project process
 */
public class ProjectDeleteView extends ProjectView {
    private int projectId;

    @Override
    protected void template() {
        System.out.println("Main > Projects > delete");
        System.out.println("Inset Project ID: ");
        System.out.println("\n======================\n");
        System.out.print("Project ID : ");
        projectId = getUserIntInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Project(projectId));
                setNextView(this);
                break;
            case "2":
                setNextView(projectViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

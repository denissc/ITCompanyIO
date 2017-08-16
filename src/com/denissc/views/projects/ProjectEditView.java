package com.denissc.views.projects;

import com.denissc.models.Project;

/**
 * Handles edit project process
 */
public class ProjectEditView extends ProjectView {
    private int projectId;
    private int customerId;
    private String projectName;

    @Override
    protected void template() {
        System.out.println("Main > Projects > edit");
        System.out.println("Inset Project data: ");
        System.out.println("\n======================\n");
        System.out.println("Project ID :");
        projectId = getUserIntInput();
        System.out.println("New customer ID :");
        customerId = getUserIntInput();
        System.out.println("New project name : ");
        projectName = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Project(projectId, customerId, projectName));
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

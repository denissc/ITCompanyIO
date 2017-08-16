package com.denissc.views.projects;

import com.denissc.models.Project;

/**
 * Handle create project process
 */
public class ProjectCreateView extends ProjectView {
    private int projectId;
    private int customerId;
    private String projectName;

    @Override
    protected void template() {
        System.out.println("Main > Projects > create");
        System.out.println("Inset Project data: ");
        System.out.println("\n======================\n");
        System.out.println("Project ID :");
        projectId = getUserIntInput();
        System.out.println("Customer ID :");
        customerId = getUserIntInput();
        System.out.println("Project name : ");
        projectName = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.create(new Project(projectId, customerId, projectName));
                setNextView(this);
                break;
            case "2":
                setNextView(projectViewFactory.getListView());
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

package com.denissc.views.projects;

import com.denissc.models.Project;
import com.denissc.models.Team;

import java.util.Set;

/**
 * Displays project data to the console
 */
public class ProjectShowView extends ProjectView {
    @Override
    protected void template() {
        System.out.println("Main > Projects > show");
        System.out.println("\n======================\n");
        System.out.print("Project ID :");
        int projectId = getUserIntInput();
        Project project = controller.findById(projectId);
        System.out.println("Project : ");
        System.out.println(project);
        Set<Team> teams = controller.findProjectTeams(project);
        if (teams.size() > 0) {
            System.out.println("Project Teams : ");
            for (Team team :
                    teams) {
                System.out.println(team);
            }
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - show, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input){
            case "1":
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

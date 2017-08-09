package com.denissc.views.projects;

import com.denissc.models.Project;
import com.denissc.models.Team;
import com.denissc.views.ConsoleView;

import java.util.Set;

/**
 * Created by denissc on 09.08.17.
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
        System.out.println("Project Teams : ");
        Set<Team> teams = controller.findProjectTeams(project);
        for (Team team :
                teams) {
            System.out.println(team);
        }
        System.out.println("1 - show, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input){
            case "1":
                render();
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

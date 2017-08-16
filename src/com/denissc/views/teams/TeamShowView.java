package com.denissc.views.teams;

import com.denissc.models.Developer;
import com.denissc.models.Team;

import java.util.Set;

/**
 * Displays team data to the console
 */
public class TeamShowView extends TeamView {
    @Override
    protected void template() {
        System.out.println("Main > Teams > show");
        System.out.println("\n======================\n");
        System.out.print("Team ID :");
        int customerId = getUserIntInput();
        Team team = controller.findById(customerId);
        System.out.println("Team : ");
        System.out.println(team);
        Set<Developer> developers = controller.findTeamDevelopers(team);
        if (developers.size() > 0) {
            System.out.println("Team Developers : ");
            for (Developer developer :
                    developers) {
                System.out.println(developer);
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
                setNextView(teamViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

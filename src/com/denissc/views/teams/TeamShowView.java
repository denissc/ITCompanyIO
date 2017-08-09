package com.denissc.views.teams;

import com.denissc.models.Developer;
import com.denissc.models.Team;

import java.util.Set;

/**
 * Created by denissc on 09.08.17.
 */
public class TeamShowView extends TeamView {
    @Override
    protected void template() {
        System.out.println("Main > Customers > show");
        System.out.println("\n======================\n");
        System.out.print("Customer ID :");
        int customerId = getUserIntInput();
        Team team = controller.findById(customerId);
        System.out.println("Customer : ");
        System.out.println(team);
        System.out.println("Customer Projects : ");
        Set<Developer> developers = controller.findTeamDevelopers(team);
        for (Developer developer :
                developers) {
            System.out.println(developer);
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

package com.denissc.views.developers;

import com.denissc.models.Developer;
import com.denissc.models.Skill;

import java.util.Set;

/**
 * Created by denissc on 10.08.17.
 */
public class DeveloperShowView extends DeveloperView {

    @Override
    protected void template() {
        System.out.println("Main > Developers > show");
        System.out.println("\n======================\n");
        System.out.print("Developer ID :");
        int customerId = getUserIntInput();
        Developer developer = controller.findById(customerId);
        System.out.println("Developer : ");
        System.out.println(developer);
        System.out.println("Developer Skills : ");
        Set<Skill> skills = controller.findDeveloperSkills(developer);
        if (skills != null) {
            for (Skill skill : skills) {
                System.out.println(skill);
            }
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

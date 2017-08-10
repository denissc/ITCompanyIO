package com.denissc.views.skills;

import com.denissc.models.Skill;

import java.util.Set;

/**
 * Created by denissc on 10.08.17.
 */
public class SkillListView extends SkillView {
    protected void template() {
        System.out.println("Main > Skills");
        System.out.println("Skill List : ");
        System.out.println("\n=====================\n");
        Set<Skill> skills = controller.findAll();
        if (skills != null) {
            for (Skill project :
                    skills) {
                System.out.println(project);
            }
        } else {
            System.out.println("No skills found here yet.");
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
                menuViewFactory.getMenuView().render();
            case "quit":
                break;
            default:
                render();

        }
    }
}

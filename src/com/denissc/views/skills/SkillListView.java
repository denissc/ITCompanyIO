package com.denissc.views.skills;

import com.denissc.models.Skill;

import java.util.Set;

/**
 * Displays skill list
 */
public class SkillListView extends SkillView {
    protected void template() {
        System.out.println("Main > Skills");
        System.out.println("Skill List : ");
        System.out.println("\n=====================\n");
        Set<Skill> skills = controller.findAll();
        if (skills.size() > 0) {
            for (Skill project :
                    skills) {
                System.out.println(project);
            }
        } else {
            System.out.println("No skills found here yet.");
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                setNextView(skillViewFactory.getCreateView());
                break;
            case "2":
                setNextView(skillViewFactory.getShowView());
                break;
            case "3":
                setNextView(skillViewFactory.getEditView());
                break;
            case "4":
                setNextView(skillViewFactory.getDeleteView());
                break;
            case "5":
                setNextView(skillViewFactory.getMenuView());
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

package com.denissc.views.skills;

import com.denissc.models.Skill;

/**
 * Handle of skill create process
 */
public class SkillCreateView extends SkillView {
    private int id;
    private int developerId;
    private String name;

    @Override
    protected void template() {
        System.out.println("Main > Skills > create");
        System.out.println("Inset Skill data: ");
        System.out.println("\n======================\n");
        System.out.println("Skill ID :");
        id = getUserIntInput();
        System.out.println("Developer ID :");
        developerId = getUserIntInput();
        System.out.println("Skill name : ");
        name = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.create(new Skill(id, developerId, name));
                setNextView(this);
                break;
            case "2":
                setNextView(skillViewFactory.getListView());
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

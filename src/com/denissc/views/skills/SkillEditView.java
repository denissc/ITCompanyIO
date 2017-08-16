package com.denissc.views.skills;

import com.denissc.models.Skill;

/**
 * Handles edit skill logic
 */
public class SkillEditView extends SkillView {
    private int id;
    private int developerId;
    private String name;

    @Override
    protected void template() {
        System.out.println("Main > Skills > edit");
        System.out.println("Inset Skill data: ");
        System.out.println("\n======================\n");
        System.out.println("Skill ID :");
        id = getUserIntInput();
        System.out.println("New developer ID :");
        developerId = getUserIntInput();
        System.out.println("New skill name : ");
        name = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Skill(id, developerId, name));
                setNextView(this);
                break;
            case "2":
                setNextView(skillViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

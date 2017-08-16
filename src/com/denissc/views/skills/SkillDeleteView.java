package com.denissc.views.skills;

import com.denissc.models.Skill;

/**
 * Handle Delete skill process
 */
public class SkillDeleteView extends SkillView {
    private int id;

    @Override
    protected void template() {
        System.out.println("Main > Skills > delete");
        System.out.println("Inset Skill ID: ");
        System.out.println("\n======================\n");
        System.out.print("Skill ID : ");
        id = getUserIntInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Skill(id));
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

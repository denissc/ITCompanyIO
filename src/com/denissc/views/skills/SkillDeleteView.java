package com.denissc.views.skills;

import com.denissc.models.Skill;

/**
 * Created by denissc on 10.08.17.
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
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Skill(id));
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

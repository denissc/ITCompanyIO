package com.denissc.views.skills;

import com.denissc.models.Skill;

/**
 * Created by denissc on 10.08.17.
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
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Skill(id, developerId, name));
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

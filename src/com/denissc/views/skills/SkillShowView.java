package com.denissc.views.skills;

import com.denissc.models.Skill;

/**
 * Created by denissc on 10.08.17.
 */
public class SkillShowView extends SkillView {
    @Override
    protected void template() {
        System.out.println("Main > Skills > show");
        System.out.println("\n======================\n");
        System.out.print("Skill ID :");
        int skillId = getUserIntInput();
        Skill project = controller.findById(skillId);
        System.out.println("Skill : ");
        System.out.println(project);
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

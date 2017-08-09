package com.denissc.views;

import com.denissc.views.companies.CompanyCrudViewFactory;
import com.denissc.views.customers.CustomerCrudViewFactory;
import com.denissc.views.developers.DeveloperCrudViewFactory;
import com.denissc.views.projects.ProjectCrudViewFactory;
import com.denissc.views.skills.SkillCrudViewFactory;
import com.denissc.views.teams.TeamCrudViewFactory;

/**
 * Created by denissc on 05.08.17.
 */
public class MainMenuView extends ConsoleView {

    ConsoleCrudViewFactory companyCrudViewFactory = new CompanyCrudViewFactory();
    ConsoleCrudViewFactory customerCrudViewFactory = new CustomerCrudViewFactory();
    ConsoleCrudViewFactory projectCrudViewFactory = new ProjectCrudViewFactory();
    ConsoleCrudViewFactory teamCrudViewFactory = new TeamCrudViewFactory();
    ConsoleCrudViewFactory developerCrudViewFactory = new DeveloperCrudViewFactory();
    ConsoleCrudViewFactory skillCrudViewFactory = new SkillCrudViewFactory();

    @Override
    public void template() {
        System.out.println("MainMenuView: ");
        System.out.println("\n=====================\n");
        System.out.println("1 - Companies;");
        System.out.println("2 - Customers;");
        System.out.println("3 - Projects;");
        System.out.println("4 - Teams;");
        System.out.println("5 - Developers;");
        System.out.println("6 - Skills;");
        System.out.println("\n=====================\n");
    }

    @Override
    public void processInput(String input) {
        switch (input) {
            case "1":
                companyCrudViewFactory.getListView().render();
                break;
            case "2":
                customerCrudViewFactory.getListView().render();
                break;
            case "3":
                projectCrudViewFactory.getListView().render();
                break;
            case "4":
                teamCrudViewFactory.getListView().render();
                break;
            case "5":
                developerCrudViewFactory.getListView().render();
                break;
            case "6":
                skillCrudViewFactory.getListView().render();
                break;
            case "quit":
                break;
            default:
                render();
        }
    }
}

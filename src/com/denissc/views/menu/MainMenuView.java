package com.denissc.views.menu;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;
import com.denissc.views.companies.CompanyViewFactory;
import com.denissc.views.customers.CustomerViewFactory;
import com.denissc.views.developers.DeveloperViewFactory;
import com.denissc.views.projects.ProjectViewFactory;
import com.denissc.views.skills.SkillViewFactory;
import com.denissc.views.teams.TeamViewFactory;

/**
 * Created by denissc on 05.08.17.
 */
public class MainMenuView extends ConsoleView {

    ConsoleViewFactory companyCrudViewFactory = new CompanyViewFactory();
    ConsoleViewFactory customerCrudViewFactory = new CustomerViewFactory();
    ConsoleViewFactory projectCrudViewFactory = new ProjectViewFactory();
    ConsoleViewFactory teamCrudViewFactory = new TeamViewFactory();
    ConsoleViewFactory developerCrudViewFactory = new DeveloperViewFactory();
    ConsoleViewFactory skillCrudViewFactory = new SkillViewFactory();

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

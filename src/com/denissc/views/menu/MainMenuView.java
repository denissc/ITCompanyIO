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
 * Main app view
 */
public class MainMenuView extends ConsoleView {

    private ConsoleViewFactory companyViewFactory = new CompanyViewFactory();
    private ConsoleViewFactory customerViewFactory = new CustomerViewFactory();
    private ConsoleViewFactory projectViewFactory = new ProjectViewFactory();
    private ConsoleViewFactory teamViewFactory = new TeamViewFactory();
    private ConsoleViewFactory developerViewFactory = new DeveloperViewFactory();
    private ConsoleViewFactory skillViewFactory = new SkillViewFactory();

    @Override
    public void template() {
        System.out.println("Menu: ");
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
                companyViewFactory.getListView().render();
                break;
            case "2":
                customerViewFactory.getListView().render();
                break;
            case "3":
                projectViewFactory.getListView().render();
                break;
            case "4":
                teamViewFactory.getListView().render();
                break;
            case "5":
                developerViewFactory.getListView().render();
                break;
            case "6":
                skillViewFactory.getListView().render();
                break;
            case "quit":
                break;
            default:
                render();
        }
    }
}

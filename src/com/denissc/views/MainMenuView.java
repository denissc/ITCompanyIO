package com.denissc.views;

import com.denissc.views.companies.CompanyCrudViewFactory;

/**
 * Created by denissc on 05.08.17.
 */
public class MainMenuView extends ConsoleView {

    CompanyCrudViewFactory companyCrudViewFactory = new CompanyCrudViewFactory();

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
//            case "2":
//                new CustomersList(new CustomerController()).render();
//                break;
//            case "3":
//                new ProjectsList(new ProjectController()).render();
//                break;
            case "quit":
                break;
            default:
                render();
        }
    }
}

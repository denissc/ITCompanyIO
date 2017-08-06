package com.denissc.views.companies;

import com.denissc.models.Model;
import com.denissc.views.ConsoleView;
import com.denissc.views.MainMenuView;

import java.util.Set;

/**
 * Created by denissc on 05.08.17.
 */
public class CompaniesListView extends CompanyView {
    @Override
    protected void template() {
        System.out.println("Main > Companies");
        System.out.println("Companies List : ");
        System.out.println("\n=====================\n");
        Set<Model> companiesSet = controller.findAll();
        if (companiesSet != null) {
            for (Model company :
                    companiesSet) {
                System.out.println(company);
            }
        } else {
            System.out.println("No companies found here yet.");
        }

        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        ConsoleView consoleView = null;
        switch (input) {
            case "1":
                consoleView = viewFactory.getCreateView();
                break;
            case "2":
                consoleView = viewFactory.getShowView();
                break;
            case "3":
                consoleView = viewFactory.getEditView();
                break;
            case "4":
                consoleView = viewFactory.getDeleteView();
                break;
            case "5":
                consoleView = new MainMenuView();
            case "quit":
                break;
            default:
                render();

        }

        if (consoleView != null)
            consoleView.render();
    }
}

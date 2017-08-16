package com.denissc.views.companies;

import com.denissc.models.Company;

import java.util.Set;

/**
 * Displays company list
 */
public class CompanyListView extends CompanyView {
    @Override
    protected void template() {
        System.out.println("Main > Companies");
        System.out.println("Companies List : ");
        System.out.println("\n=====================\n");
        Set<Company> companies = controller.findAll();
        if (companies.size() > 0) {
            for (Company company :
                    companies) {
                System.out.println(company);
            }
        } else {
            System.out.println("No companies found here yet.");
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                setNextView(companyViewFactory.getCreateView());
                break;
            case "2":
                setNextView(companyViewFactory.getShowView());
                break;
            case "3":
                setNextView(companyViewFactory.getEditView());
                break;
            case "4":
                setNextView(companyViewFactory.getDeleteView());
                break;
            case "5":
                setNextView(companyViewFactory.getMenuView());
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

package com.denissc.views.companies;

import com.denissc.models.Company;

/**
 * Handle Create company process
 */
public class CompanyCreateView extends CompanyView {

    private int companyId;
    private String companyName;

    @Override
    protected void template() {
        System.out.println("Main > Companies > create");
        System.out.println("Inset Company data: ");
        System.out.println("\n======================\n");
        System.out.println("Company ID :");
        companyId = getUserIntInput();
        System.out.println("Company name : ");
        companyName = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.create(new Company(companyId, companyName));
                setNextView(this);
                break;
            case "2":
                setNextView(companyViewFactory.getListView());
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

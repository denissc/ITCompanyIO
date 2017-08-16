package com.denissc.views.companies;

import com.denissc.models.Company;

/**
 * Handles delete company process
 */
public class CompanyDeleteView extends CompanyView {
    private int companyId;

    @Override
    protected void template() {
        System.out.println("Main > Companies > delete");
        System.out.println("Inset Company ID: ");
        System.out.println("\n======================\n");
        System.out.println("Company ID :");
        companyId = getUserIntInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Company(companyId));
                setNextView(this);
                break;
            case "2":
                setNextView(companyViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

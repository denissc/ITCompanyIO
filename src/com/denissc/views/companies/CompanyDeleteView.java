package com.denissc.views.companies;

import com.denissc.models.Company;

/**
 * Created by denissc on 05.08.17.
 */
public class CompanyDeleteView extends CompanyView {
    private int companyId;

    @Override
    protected void template() {
        System.out.println("Main > Companies > delete");
        System.out.println("Inset Company ID: ");
        System.out.println("\n======================\n");
        System.out.println("Company ID :");
        companyId = Integer.parseInt(getUserInput());
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Company(companyId,""));
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

package com.denissc.views.companies;

import com.denissc.models.Company;

/**
 * Created by denissc on 06.08.17.
 */
public class CompanyEditView extends CompanyView {
    private int companyId;
    private String companyName;

    @Override
    protected void template() {
        System.out.println("Main > Companies > edit");
        System.out.println("Inset Company data: ");
        System.out.println("\n======================\n");
        System.out.println("Company ID :");
        companyId = Integer.parseInt(getUserInput());
        System.out.println("New company name : ");
        companyName = getUserInput();
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Company(companyId, companyName));
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

package com.denissc.views.companies;

import com.denissc.models.Model;

/**
 * Created by denissc on 05.08.17.
 */
public class CompanyShowView extends CompanyView {
    private int companyId;

    @Override
    protected void template() {
        System.out.println("Main > Companies > show");
        System.out.println("\n======================\n");
        System.out.println("Company ID :");
        companyId = Integer.parseInt(getUserInput());
        Model company = controller.findById(companyId);
        System.out.println("Company : ");
        System.out.println(company);
        System.out.println("1 - show, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input){
            case "1":
                render();
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

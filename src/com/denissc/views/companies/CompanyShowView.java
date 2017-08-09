package com.denissc.views.companies;

import com.denissc.models.Company;
import com.denissc.models.Customer;
import com.denissc.models.Model;

import java.util.Set;

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
        companyId = getUserIntInput();
        Company company = controller.findById(companyId);
        System.out.println("Company : ");
        System.out.println(company);
        System.out.println("Company Customers : ");
        Set<Customer> customers = controller.findCompanyCustomers(company);
        for (Customer customer :
                customers) {
            System.out.println(customer);
        }
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

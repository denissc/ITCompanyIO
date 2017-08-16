package com.denissc.views.companies;

import com.denissc.models.Company;
import com.denissc.models.Customer;

import java.util.Set;

/**
 * Displays company data
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
        Set<Customer> customers = controller.findCompanyCustomers(company);
        if (customers.size() > 0) {
            System.out.println("Company Customers : ");
            for (Customer customer :
                    customers) {
                System.out.println(customer);
            }
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - show, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input){
            case "1":
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

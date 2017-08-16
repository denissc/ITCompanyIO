package com.denissc.views.customers;

import com.denissc.models.Customer;

/**
 * Handles create customer process
 */
public class CustomerCreateView extends CustomerView {
    private int customerId;
    private int companyId;
    private String customerName;

    @Override
    protected void template() {
        System.out.println("Main > Customers > create");
        System.out.println("Inset Customer data: ");
        System.out.println("\n======================\n");
        System.out.println("Customer ID :");
        customerId = getUserIntInput();
        System.out.println("Company ID :");
        companyId = getUserIntInput();
        System.out.println("Customer name : ");
        customerName = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.create(new Customer(customerId,companyId, customerName));
                setNextView(this);
                break;
            case "2":
                setNextView(customerViewFactory.getListView());
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

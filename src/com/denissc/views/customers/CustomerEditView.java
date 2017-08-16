package com.denissc.views.customers;

import com.denissc.models.Customer;

/**
 * Handle edit customer process
 */
public class CustomerEditView extends CustomerView {
    private int customerId;
    private int companyId;
    private String customerName;

    @Override
    protected void template() {
        System.out.println("Main > Customers > edit");
        System.out.println("Inset Customer data: ");
        System.out.println("\n======================\n");
        System.out.println("Customer ID :");
        customerId = getUserIntInput();
        System.out.println("New Company ID :");
        companyId = getUserIntInput();
        System.out.println("New company name : ");
        customerName = getUserInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - edit, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.update(new Customer(customerId, companyId, customerName));
                setNextView(this);
                break;
            case "2":
                setNextView(customerViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

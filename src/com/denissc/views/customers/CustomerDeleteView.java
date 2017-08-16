package com.denissc.views.customers;

import com.denissc.models.Customer;

/**
 * Handle delete customer process
 */
public class CustomerDeleteView extends CustomerView {
    private int customerId;

    @Override
    protected void template() {
        System.out.println("Main > Customers > delete");
        System.out.println("Inset Customer ID: ");
        System.out.println("\n======================\n");
        System.out.print("Customer ID :");
        customerId = getUserIntInput();
        System.out.println("\n=====================\n");
        System.out.println("1 - delete, 2 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                controller.delete(new Customer(customerId));
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

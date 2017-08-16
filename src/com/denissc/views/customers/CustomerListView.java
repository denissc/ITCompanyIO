package com.denissc.views.customers;

import com.denissc.models.Customer;

import java.util.Set;

/**
 * Displays customer list
 */
public class CustomerListView extends CustomerView {
    protected void template() {
        System.out.println("Main > Customers");
        System.out.println("Customers List : ");
        System.out.println("\n=====================\n");
        Set<Customer> customers = controller.findAll();
        if (customers.size() > 0) {
            for (Customer customer :
                    customers) {
                System.out.println(customer);
            }
        } else {
            System.out.println("No customers found here yet.");
        }
        System.out.println("\n=====================\n");
        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                setNextView(customerViewFactory.getCreateView());
                break;
            case "2":
                setNextView(customerViewFactory.getShowView());
                break;
            case "3":
                setNextView(customerViewFactory.getEditView());
                break;
            case "4":
                setNextView(customerViewFactory.getDeleteView());
                break;
            case "5":
                setNextView(customerViewFactory.getMenuView());
            case "quit":
                break;
            default:
                setNextView(this);

        }
    }
}

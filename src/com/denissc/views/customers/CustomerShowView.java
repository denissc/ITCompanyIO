package com.denissc.views.customers;

import com.denissc.models.Customer;
import com.denissc.models.Project;

import java.util.Set;

/**
 * Displays customer data
 */
public class CustomerShowView extends CustomerView {

    @Override
    protected void template() {
        System.out.println("Main > Customers > show");
        System.out.println("\n======================\n");
        System.out.print("Customer ID :");
        int customerId = getUserIntInput();
        Customer customer = controller.findById(customerId);
        System.out.println("Customer : ");
        System.out.println(customer);
        Set<Project> projects = controller.findCustomerProjects(customer);
        if (projects.size() > 0) {
            System.out.println("Customer Projects : ");
            for (Project project :
                    projects) {
                System.out.println(project);
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
                setNextView(customerViewFactory.getListView());
                break;
            case "quit":
                break;
            default:
                setNextView(this);
        }
    }
}

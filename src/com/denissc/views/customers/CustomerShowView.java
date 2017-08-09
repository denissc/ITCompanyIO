package com.denissc.views.customers;

import com.denissc.models.Customer;
import com.denissc.models.Project;

import java.util.Set;

/**
 * Created by denissc on 09.08.17.
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
        System.out.println("Customer Projects : ");
        Set<Project> projects = controller.findCustomerProjects(customer);
        for (Project project :
                projects) {
            System.out.println(project);
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

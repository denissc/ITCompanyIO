package com.denissc.views.customers;

import com.denissc.models.Customer;
import com.denissc.views.menu.MainMenuView;

import java.util.Set;

/**
 * Created by denissc on 09.08.17.
 */
public class CustomerListView extends CustomerView {
    protected void template() {
        System.out.println("Main > Customers");
        System.out.println("Customers List : ");
        System.out.println("\n=====================\n");
        Set<Customer> customers = controller.findAll();
        if (customers != null) {
            for (Customer customer :
                    customers) {
                System.out.println(customer);
            }
        } else {
            System.out.println("No customers found here yet.");
        }

        System.out.println("1 - create, 2 - show, 3 - edit, 4 - delete, 5 - back, 'quit' - for quit");
    }

    @Override
    protected void processInput(String input) {
        switch (input) {
            case "1":
                viewFactory.getCreateView().render();
                break;
            case "2":
                viewFactory.getShowView().render();
                break;
            case "3":
                viewFactory.getEditView().render();
                break;
            case "4":
                viewFactory.getDeleteView().render();
                break;
            case "5":
                menuViewFactory.getMenuView().render();
            case "quit":
                break;
            default:
                render();

        }
    }
}

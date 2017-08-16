package com.denissc.views.customers;

import com.denissc.controllers.CustomerController;
import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Class that compose customer controller to view
 */
abstract class CustomerView extends ConsoleView {
    CustomerController controller = new CustomerController();
    CustomerViewFactory customerViewFactory = new CustomerViewFactory();
}

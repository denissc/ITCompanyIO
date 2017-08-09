package com.denissc.views.customers;

import com.denissc.controllers.CustomerController;
import com.denissc.views.ConsoleCrudViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 09.08.17.
 */
public abstract class CustomerView extends ConsoleView {
    CustomerController controller = new CustomerController();
    ConsoleCrudViewFactory viewFactory = new CustomerCrudViewFactory();
}

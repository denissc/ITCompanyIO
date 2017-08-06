package com.denissc.views.companies;

import com.denissc.controllers.CompanyController;
import com.denissc.controllers.ConsoleController;
import com.denissc.views.ConsoleCrudViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 06.08.17.
 */
public abstract class CompanyView extends ConsoleView {
    ConsoleController controller = new CompanyController();

    ConsoleCrudViewFactory viewFactory = new CompanyCrudViewFactory();
}

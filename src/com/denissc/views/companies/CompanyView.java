package com.denissc.views.companies;

import com.denissc.controllers.CompanyController;
import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 06.08.17.
 */
public abstract class CompanyView extends ConsoleView {
    CompanyController controller = new CompanyController();

    ConsoleViewFactory viewFactory = new CompanyViewFactory();
}

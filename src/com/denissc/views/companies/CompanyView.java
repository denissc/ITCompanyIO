package com.denissc.views.companies;

import com.denissc.controllers.CompanyController;
import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Class that composes company controller to view
 */
abstract class CompanyView extends ConsoleView {
    CompanyController controller = new CompanyController();
    CompanyViewFactory companyViewFactory = new CompanyViewFactory();
}

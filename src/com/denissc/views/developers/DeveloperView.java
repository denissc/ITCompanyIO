package com.denissc.views.developers;

import com.denissc.controllers.DeveloperController;
import com.denissc.views.ConsoleView;

/**
 * Class that composes developer controller to view
 */
abstract class DeveloperView extends ConsoleView {
    DeveloperController controller = new DeveloperController();
    DeveloperViewFactory developerViewFactory = new DeveloperViewFactory();
}

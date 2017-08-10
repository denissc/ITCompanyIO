package com.denissc.views.developers;

import com.denissc.controllers.DeveloperController;
import com.denissc.views.ConsoleView;
import com.denissc.views.ConsoleViewFactory;

/**
 * Created by denissc on 10.08.17.
 */
public abstract class DeveloperView extends ConsoleView {
    DeveloperController controller = new DeveloperController();
    ConsoleViewFactory viewFactory = new DeveloperViewFactory();
}

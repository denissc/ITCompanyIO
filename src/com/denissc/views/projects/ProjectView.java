package com.denissc.views.projects;

import com.denissc.controllers.ProjectController;
import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Class that composes project controller to view
 */
abstract class ProjectView extends ConsoleView {
    ProjectController controller = new ProjectController();
    ProjectViewFactory projectViewFactory = new ProjectViewFactory();
}

package com.denissc.views.projects;

import com.denissc.controllers.ProjectController;
import com.denissc.views.ConsoleCrudViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 09.08.17.
 */
public abstract class ProjectView extends ConsoleView {
    ProjectController controller = new ProjectController();
    ConsoleCrudViewFactory viewFactory = new ProjectCrudViewFactory();
}

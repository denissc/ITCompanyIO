package com.denissc.views.skills;

import com.denissc.controllers.SkillController;
import com.denissc.views.ConsoleView;
import com.denissc.views.ConsoleViewFactory;

/**
 * Created by denissc on 10.08.17.
 */
public abstract class SkillView extends ConsoleView {
    SkillController controller = new SkillController();
    ConsoleViewFactory viewFactory = new SkillViewFactory();
}

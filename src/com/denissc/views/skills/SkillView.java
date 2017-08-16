package com.denissc.views.skills;

import com.denissc.controllers.SkillController;
import com.denissc.views.ConsoleView;

/**
 * Class that composes skill controller to view
 */
abstract class SkillView extends ConsoleView {
    SkillController controller = new SkillController();
    SkillViewFactory skillViewFactory = new SkillViewFactory();
}

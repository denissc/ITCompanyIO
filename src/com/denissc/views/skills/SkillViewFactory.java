package com.denissc.views.skills;

import com.denissc.views.ConsoleViewFactory;
import com.denissc.views.ConsoleView;

/**
 * Created by denissc on 08.08.17.
 */
public class SkillViewFactory implements ConsoleViewFactory {
    @Override
    public SkillView getListView() {
        return new SkillListView();
    }

    @Override
    public SkillView getCreateView() {
        return new SkillCreateView();
    }

    @Override
    public SkillView getEditView() {
        return new SkillEditView();
    }

    @Override
    public SkillView getDeleteView() {
        return new SkillDeleteView();
    }

    @Override
    public SkillView getShowView() {
        return new SkillShowView();
    }
}

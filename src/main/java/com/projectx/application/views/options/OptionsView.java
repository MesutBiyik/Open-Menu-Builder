package com.projectx.application.views.options;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "options", layout = MainView.class)
@PageTitle("Options")
@CssImport("./styles/views/options/options-view.css")
public class OptionsView extends Div {

    public OptionsView() {
        setId("options-view");
        add(new Label("Content placeholder"));
    }

}

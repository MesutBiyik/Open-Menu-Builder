package com.projectx.application.views.plusgroups;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "pluses ", layout = MainView.class)
@PageTitle("Plus Groups")
@CssImport("./styles/views/plusgroups/plus-groups-view.css")
public class PlusGroupsView extends Div {

    public PlusGroupsView() {
        setId("plus-groups-view");
        add(new Label("Content placeholder"));
    }

}

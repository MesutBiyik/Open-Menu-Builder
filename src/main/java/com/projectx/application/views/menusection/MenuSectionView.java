package com.projectx.application.views.menusection;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "sections", layout = MainView.class)
@PageTitle("Menu Section")
@CssImport("./styles/views/menusection/menu-section-view.css")
public class MenuSectionView extends Div {

    public MenuSectionView() {
        setId("menu-section-view");
        add(new Label("Content placeholder"));
    }

}

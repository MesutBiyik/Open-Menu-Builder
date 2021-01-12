package com.projectx.application.views.collections;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "collections", layout = MainView.class)
@PageTitle("Collections")
@CssImport("./styles/views/collections/collections-view.css")
public class CollectionsView extends Div {

    public CollectionsView() {
        setId("collections-view");
        add(new Label("Content placeholder"));
    }

}

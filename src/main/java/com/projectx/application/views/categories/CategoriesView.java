package com.projectx.application.views.categories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "Categories", layout = MainView.class)
@PageTitle("Categories")
@CssImport("./styles/views/categories/categories-view.css")
public class CategoriesView extends Div {

    public CategoriesView() {
        setId("categories-view");
        add(new Label("Content placeholder"));


    }


}

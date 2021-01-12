package com.projectx.application.views.customers;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "customers", layout = MainView.class)
@PageTitle("Customers")
@CssImport("./styles/views/customers/customers-view.css")
public class CustomersView extends Div {

    public CustomersView() {
        setId("customers-view");
        add(new Label("Content placeholder"));
    }

}

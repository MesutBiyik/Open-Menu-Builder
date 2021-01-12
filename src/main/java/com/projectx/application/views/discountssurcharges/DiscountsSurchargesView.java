package com.projectx.application.views.discountssurcharges;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "discountsandsurcharges", layout = MainView.class)
@PageTitle("Discounts & Surcharges")
@CssImport("./styles/views/discountssurcharges/discounts-surcharges-view.css")
public class DiscountsSurchargesView extends Div {

    public DiscountsSurchargesView() {
        setId("discounts-surcharges-view");
        add(new Label("Content placeholder"));
    }

}

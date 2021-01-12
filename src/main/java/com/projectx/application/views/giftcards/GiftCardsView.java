package com.projectx.application.views.giftcards;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;

@Route(value = "giftcards", layout = MainView.class)
@PageTitle("Gift Cards")
@CssImport("./styles/views/giftcards/gift-cards-view.css")
public class GiftCardsView extends Div {

    public GiftCardsView() {
        setId("gift-cards-view");
        add(new Label("Content placeholder"));
    }

}

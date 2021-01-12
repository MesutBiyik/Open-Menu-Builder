package com.projectx.application.views.welcome;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.projectx.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "Welcome", layout = MainView.class)
@PageTitle("Welcome")
@CssImport("./styles/views/welcome/welcome-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class WelcomeView extends HorizontalLayout {

    //Create page text data
    private H1 pageTitle = new H1("Welcome to Menu Builder");
    private H2 title = new H2("Congratulations - you've made it to the Menu Builder");
    private H3 paragraph1Title = new H3("What is the Menu Builder?");
    private H3 paragraph2Title = new H3("What to expect");
    private H3 paragraph3Title = new H3("What will i need to get started?");

    private String paragraph1= "This is where we will walk you through step-by-step," +
            "to build your menu to be POS-ready. Don't worry, you don't need any Technical skills!";
    private String paragraph2 = "The next screens will ask you a series of questions" +
            "about your menu, such as 'what sections do you have?' and 'what items do you have?'.";
    private String paragraph3 = "all you will need is: " +
            "- A computer or laptop." +
            "- Your menu on hand."  +
            "- 15 - 30 minutes (depending on the size of your menu!)";


    private Button nextPage = new Button("I'm ready! Let's go >");


    public WelcomeView() {
        setId("welcome-view");

        add(createHeader());


    }


    private VerticalLayout createHeader(){
        VerticalLayout header = new VerticalLayout();

        Text paragraph1Details = new Text(paragraph1);

        Text paragraph2Details = new Text(paragraph2);

        Text paragraph3Details = new Text(paragraph3);

        //Set layout alignment
        header.setHorizontalComponentAlignment(Alignment.CENTER);

        //Add all the informaiton to the frame
        header.add(pageTitle,
                title,
                paragraph1Title,
                paragraph1Details,
                paragraph2Title,
                paragraph2Details,
                paragraph3Title,
                paragraph3Details,
                nextPage);
        //maybe put nextpage button into horiztonal layout and align end

        //Add button click listen to go to about you page
        nextPage.addClickListener(clikcEvent ->
                UI.getCurrent().navigate("aboutyou"));
        return header;
    }


    
}

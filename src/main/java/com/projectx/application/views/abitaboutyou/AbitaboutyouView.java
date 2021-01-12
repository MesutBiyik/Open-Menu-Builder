package com.projectx.application.views.abitaboutyou;

import com.projectx.application.backend.entity.model.BusinessInfo;
import com.projectx.application.backend.entity.resource.BusinessInfoResource;
import com.projectx.application.views.main.MainView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@PreserveOnRefresh
@Route(value = "aboutyou", layout = MainView.class)
@PageTitle("A bit about you")
@CssImport("./styles/views/abitaboutyou/abitaboutyou-view.css")

public class AbitaboutyouView extends HorizontalLayout {
    //Configure page variables
    @Autowired
    private BusinessInfoResource bResource;

    private H1 pageTitle = new H1("Welcome to Menu Builder");
    private TextField venueNameField = new TextField("What is your venue name?");
    private IntegerField venueABNField = new IntegerField("What is your ABN?");
    private TextField emailAddressField = new TextField("Email Address");
    private IntegerField venueNumberField = new IntegerField("Phone Number");
    private TextField venueAddress = new TextField("What is your venue Address");


    public List <BusinessInfo> currentStore;


    public AbitaboutyouView() {
        setId("abitaboutyou-view");

        add(createHeader());


    }
    private VerticalLayout createHeader(){

        //Setup Layout
        VerticalLayout header = new VerticalLayout();

        //Set alignment
        header.setHorizontalComponentAlignment(Alignment.CENTER);
        //Set padding
        header.setPadding(true);

        //Configure Venue name field
        venueNameField.setClearButtonVisible(true);
        venueNameField.setPlaceholder("Venue Name here!");
        venueNameField.setValueChangeMode(ValueChangeMode.EAGER);
        venueNameField.setWidth("300px");

        //Configure Venue ABN field
        venueABNField.setClearButtonVisible(true);
        venueABNField.setPlaceholder("Your Australian Business Number here");
        venueABNField.setValueChangeMode(ValueChangeMode.EAGER);
        venueABNField.setWidth("300px");

        //Configure Email address field
        emailAddressField.setClearButtonVisible(true);
        emailAddressField.setPlaceholder("Your business email");
        emailAddressField.setValueChangeMode(ValueChangeMode.EAGER);
        emailAddressField.setWidth("300px");

        //Configure Venue Number
        venueAddress.setClearButtonVisible(true);
        venueAddress.setPlaceholder("Your business phone no");
        venueAddress.setWidth("300px");

        //Configure Venue Address
        venueNameField.setClearButtonVisible(true);
        venueNameField.setPlaceholder("Venue Name here!");
        venueNameField.setValueChangeMode(ValueChangeMode.EAGER);
        venueNameField.setWidth("300px");


        //Button variable and action(& validate)
        Button saveBusinessInfo = new Button("Save",buttonClickEvent ->
            validateBusinessInfo(venueNameField.getValue(),venueABNField.getValue(),emailAddressField.getValue(),venueNumberField.getValue()));

        //Add all the information to the layout
        header.add(pageTitle,
                venueNameField,
                venueABNField,
                emailAddressField,
                venueNumberField,
                venueAddress,
                saveBusinessInfo);
        return header;
    }

    //Push Business info to DB (business_info table)
    private void businessDataSend(String name, Integer ABN, String email, Integer venueNumber){

        //Object to set values
        BusinessInfo data = new BusinessInfo();



                //Configure data to send to persist to DB
                data.setAbn(ABN);
                data.setBusiness_name(name);
                data.setEmail_address(email);
                data.setVenue_number(venueNumber);

                bResource.persist(data);
                int storeID = data.getStore_id();
                List<BusinessInfo> data1 = bResource.getAll();
    }

    //Validate Business Info data
    private void validateBusinessInfo(String name, Integer ABN, String email, Integer number){

        //Handle empty fields
        if( name.isEmpty() ){
            Notification venueNameError = new Notification(
                    "Please add a venue name!", 3000);
            venueNameError.open();

        }else if( ABN == null ){
            Notification ABNError = new Notification(
                    "Please add an ABN!", 3000);
            ABNError.open();
        }else if( email.isEmpty()){
            Notification emailError = new Notification(
                    "Please add an email address!", 3000);
            emailError.open();
        }else if( number == null ){
            Notification numberError = new Notification(
                    "Please add a phone number!", 3000);
            numberError.open();
        }
        //If fields are all valid send data to DB
        else {
            businessDataSend( venueNameField.getValue(),venueABNField.getValue(),emailAddressField.getValue(),venueNumberField.getValue());
        }
    }

    private List <BusinessInfo> venueData(Integer storeID){
        List <BusinessInfo> venueInfo = null;


        return venueInfo;
    }
}







package com.projectx.application.backend.entity.model;

import javax.persistence.*;

@Entity
public class MenuItems {

    //Setup DB fields for Menu Items table
    //Item ID set as autogenerated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer item_id;
    @Column(name = "item_name")
    private String item_name;
    @Column(name = "item_price")
    private Integer item_price;
    @Column(name = "item_section")
    private String item_section;
    @Column(name = "item_printer")
    private String item_printer;
    @Column(name = "item_category")
    private String item_category;
    @Column(name = "fk_store_id")
    private Integer fk_store_id;

    public MenuItems(){
    }

    public Integer getFk_store_id() {

        return fk_store_id;
    }

    public Integer getItem_id() {

        return item_id;
    }

    public void setItem_id(Integer item_id) {

        this.item_id = item_id;
    }

    public String getItem_name() {

        return item_name;
    }

    public void setItem_name(String item_name) {

        this.item_name = item_name;
    }

    public Integer getItem_price() {

        return item_price;
    }

    public void setItem_price(Integer item_price) {


        this.item_price = item_price;
    }

    public String getItem_section() {

        return item_section;
    }

    public void setItem_section(String item_section) {
        this.item_section = item_section;
    }

    public String getItem_printer() {

        return item_printer;
    }

    public void setItem_printer(String item_printer) {


        this.item_printer = item_printer;
    }

    public String getItem_category() {

        return item_category;
    }

    public void setItem_category(String item_category) {

        this.item_category = item_category;
    }
}
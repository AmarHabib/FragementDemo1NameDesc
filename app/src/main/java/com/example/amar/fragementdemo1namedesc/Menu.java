package com.example.amar.fragementdemo1namedesc;

/**
 * Created by amar on 12/24/17.
 */

public class Menu {

    private String name;
    private String description;



    public static final Menu[] menus = {

            new Menu("Pizza1","Thin crust \n pizza with\n extra cheez"),
            new Menu("Pizza2","Thin crust \n pizza with\n extra cheez"),
            new Menu("Pizza3","Thin crust \n pizza with\n extra cheez")
    };

    private Menu(String name,String description){

        this.name=name;
        this.description=description;


    }

    public String getName(){
        return name;

    }

    public String getDescription(){
        return description;

    }


    public String toString(){

        return this.name;
    }



















}

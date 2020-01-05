package com.devsahil.beeradvisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();

        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("desi");
        }
        else{
            brands.add("english");
        }

        return brands;
    }
}

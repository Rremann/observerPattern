package com.example.rmann.gasmatcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rmann on 12/3/15.
 */
public class MainStore {

    private List<Competitor> sStores = new ArrayList<>();
    private double myPrice;


    public double getPrice() {
        return myPrice;
    }

    public void setPrice(double price) {
        myPrice = price;
        notifyStores();

    }

    public void notifyStores(){
        for(Competitor comp: sStores){
            comp.updatePrice(myPrice);
        }
    }

    public void addStore(Competitor store){
        sStores.add(store);
    }
}

package com.example.rmann.gasmatcher;

import android.app.Activity;

/**
 * Created by rmann on 12/3/15.
 */
public abstract class Competitor {

    protected double cPrice;
    protected Activity activity;
    protected PriceChangedListener priceChanged;

    public Competitor(PriceChangedListener priceChanged){
        this.priceChanged = priceChanged;
    }

    public void updatePrice(double price){
        setPrice(price);
        priceChanged.updatePrice(getPrice());
    }
    abstract void setPrice(double price);

    double getPrice(){
        return cPrice;
    }


    public interface PriceChangedListener {
        void updatePrice(double price);
    }
}

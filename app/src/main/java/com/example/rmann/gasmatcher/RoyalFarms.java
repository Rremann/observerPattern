package com.example.rmann.gasmatcher;

import android.app.Activity;

/**
 * Created by rmann on 12/3/15.
 */
public class RoyalFarms extends Competitor {

    public RoyalFarms(PriceChangedListener priceChanged) {
        super(priceChanged);
    }

    @Override
    public void setPrice(double price){
        this.cPrice = price - .10;
    }

}

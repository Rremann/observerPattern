package com.example.rmann.gasmatcher;

import android.app.Activity;

/**
 * Created by rmann on 12/3/15.
 */
public class SevenEleven extends Competitor {

    public SevenEleven(PriceChangedListener priceChangedListener) {
        super(priceChangedListener);
    }

    @Override
    public void setPrice(double price){
        this.cPrice = price + .30;
    }


}

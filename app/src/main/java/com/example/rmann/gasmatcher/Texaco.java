package com.example.rmann.gasmatcher;

import android.app.Activity;
import android.widget.TextView;

/**
 * Created by rmann on 12/3/15.
 */
public class Texaco extends Competitor {

    public Texaco(PriceChangedListener priceChangedListener) {
        super(priceChangedListener);
    }

    @Override
    public void setPrice(double price){
        this.cPrice = price - .20;
    }

}

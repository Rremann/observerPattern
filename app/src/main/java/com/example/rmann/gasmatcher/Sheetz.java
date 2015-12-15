package com.example.rmann.gasmatcher;

/**
 * Created by rmann on 12/3/15.
 */
public class Sheetz extends Competitor {

    public Sheetz(PriceChangedListener priceChangedListener) {
        super(priceChangedListener);
    }

    @Override
    public void setPrice(double price) {
        this.cPrice = price + .50;
    }

}

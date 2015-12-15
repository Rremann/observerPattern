package com.example.rmann.gasmatcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MainStore myStore = new MainStore();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.updatePrice).setOnClickListener(this);

        myStore.addStore(new RoyalFarms(new Competitor.PriceChangedListener() {
            @Override
            public void updatePrice(double price) {
                ((TextView) findViewById(R.id.farms)).setText("" + price);
            }
        }));
        myStore.addStore(new Sheetz(new Competitor.PriceChangedListener() {
            @Override
            public void updatePrice(double price) {
                ((TextView) findViewById(R.id.sheetz)).setText("" + price);
            }
        }));
        myStore.addStore(new Texaco(new Competitor.PriceChangedListener() {
            @Override
            public void updatePrice(double price) {
                ((TextView) findViewById(R.id.texaco)).setText("" + price);
            }
        }));
        myStore.addStore(new SevenEleven(new Competitor.PriceChangedListener() {
            @Override
            public void updatePrice(double price) {
                ((TextView) findViewById(R.id.eleven)).setText("" + price);
            }
        }));


    }

    @Override
    public void onClick(View v) {
        myStore.setPrice(Double.valueOf(((TextView) findViewById(R.id.price)).getText().toString()));


    }


}

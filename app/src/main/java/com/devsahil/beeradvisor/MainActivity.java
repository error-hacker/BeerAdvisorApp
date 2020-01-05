package com.devsahil.beeradvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {

        TextView brands= (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());

        List<String> beerList = expert.getBrands(beerType);

        String beerFormatted = new String();
        for(String beer : beerList){
            beerFormatted = beerFormatted + "\n" + beer;
        }

        /*
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        */

        brands.setText(beerFormatted);
    }
}

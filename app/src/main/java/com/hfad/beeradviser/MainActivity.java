package com.hfad.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    public void onClickFindBeer(View view){
        TextView textview = findViewById(R.id.textView);
        Spinner spin = findViewById(R.id.spinner);
        List<String> list = expert.getBrands(spin.getSelectedItem().toString());
        StringBuilder builder = new StringBuilder();
        for (String brands: list){
            builder.append(brands).append("\n");
        }
        textview.setText(builder);
    }
    public void swithcToActivityTwo(View view){
        Intent i = new Intent(this, activity2.class);
        startActivity(i);
    }
}
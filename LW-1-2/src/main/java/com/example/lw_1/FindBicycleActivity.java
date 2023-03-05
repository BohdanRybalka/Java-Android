package com.example.lw_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FindBicycleActivity extends AppCompatActivity{

    private CycleExpert expert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expert = new CycleExpert(this);

    }

    public void onClickFindBicycle(View view){
        TextView brands = findViewById(R.id.textView);
        Spinner spinner = findViewById(R.id.spinner);

        String bicycle_types = String.valueOf(spinner.getSelectedItem());
        String brandsStr = expert.getBrands(bicycle_types);

        brands.setText(brandsStr);

    }

}

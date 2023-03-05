package com.example.lw_1;

import android.content.Context;

public class CycleExpert {

    private final Context context;

    public CycleExpert(Context context){
        this.context = context;
    }

    public String getBrands(String bicycle_types){

        switch (bicycle_types){
            case "Mountain":
                return context.getString(R.string.mountain_bicycle_type);
            case "Road":
                return context.getString(R.string.road_bicycle_type);
            case "Gravel":
                return context.getString(R.string.gravel_bicycle_type);
            case "Trail":
                return context.getString(R.string.trail_bicycle_type);
            default:
                return "";
        }

    }

}

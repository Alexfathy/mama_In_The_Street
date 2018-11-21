package com.example.ahmedfathy.mama_in_the_street;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //creating arrayList for meals
        final ArrayList<Meal> meals = new ArrayList<Meal>();
        meals.add(new Meal("Salad",20,R.drawable.meal1,"lemon-chicken-salt"));
        meals.add(new Meal("pasta",30,R.drawable.meal2,"macaroni-tomato-forks"));
        meals.add(new Meal("mixe",40,R.drawable.meal3,"bla-bla-bla"));
        // creating a mealAdapter object
        MealAdapter mealAdapter = new MealAdapter(this,meals);
        //find the proper list view which is in the main activity
        ListView listView = (ListView) findViewById(R.id.mainList);
        //set the adapter to the list view
        listView.setAdapter(mealAdapter);


    }
}

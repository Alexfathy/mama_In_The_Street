package com.example.ahmedfathy.mama_in_the_street;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MealAdapter extends ArrayAdapter {
    public MealAdapter(@NonNull Activity context, ArrayList<Meal> meals) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view
        //this listItemView variable refers to the Relative layout inside the list
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }
        // get the object located in this position of the list
        Meal currentMeal = (Meal) getItem(position);
        //find text view in item.xml refers to meal name
        TextView mealName = (TextView) listItemView.findViewById(R.id.mealNameTextView);
        // set the current meal name to the text view "meal Name"
        mealName.setText(currentMeal.getMealName());
        //find text view in item.xml refers to meal components
        TextView mealComponents = (TextView) listItemView.findViewById(R.id.mealComponentsTextView);
        //set the current meal components to the text view "Meal Components "
        mealComponents.setText(currentMeal.getMealComponents());
        //find text view in item.xml refers to meal price
        TextView mealPrice = (TextView) listItemView.findViewById(R.id.mealPriceTextView);
        //set the current meal price to the text View "meal price"
        // find the relative layout
        RelativeLayout parentLayout = (RelativeLayout)parent;
        //set the background of the relative layout to the current meal image

        if (currentMeal.getMealImg()!=0) {

           listItemView.setBackgroundResource(currentMeal.getMealImg());
        }
        else
        {
            listItemView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 3 text views )
        return listItemView;

    }
}

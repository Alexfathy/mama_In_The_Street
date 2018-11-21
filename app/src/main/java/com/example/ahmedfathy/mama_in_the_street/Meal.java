package com.example.ahmedfathy.mama_in_the_street;

public class Meal {
    //this variables contains the essential information t know about the meal
    private int mealImg;
    private String mealName;
    private String mealComponents;
    private double mealPrice;
    //meal constructor
  public Meal(String name,double price,int img, String components){
    this.mealImg = img;
    this.mealName = name;
    this.mealComponents = components;
    this.mealPrice = price;
  }
  //geter methods for every variable of the meal

      String getMealName(){
        return mealName;
      }
      String getMealComponents(){
        return mealComponents;
      }
      int getMealImg(){
        return mealImg;
      }
      double getMealPrice(){
        return mealPrice;
      }

}

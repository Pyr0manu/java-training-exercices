package io.robusta.animals.food;

import io.robusta.HasPrice;

import java.util.ArrayList;
import java.util.TreeSet;

public class Meal extends ArrayList<Ingredient> {

    public Meal(Ingredient...ingredients){
        for(Ingredient ingredient : ingredients){
            this.add(ingredient);
        }
    }

    public int getNutriments(){

        int nutriments = 0;
        for (Ingredient ingredient : this){
            nutriments += ingredient.getNutriment();
        }
        return nutriments;

    }

    public int getPrice(){

        int price = 0;
        for (HasPrice ingredient : this){
            price += ingredient.getPrice();
        }
        return price;
    }

    public Ingredient cheapest (){
        TreeSet<Ingredient> ingredient = new TreeSet<>();
        ingredient.addAll(this);
        return ingredient.first();
    }

}

package com.example.colddrinklister;

import android.widget.CheckBox;

public class two_element_show {
    private String Drink;
    private String Price;
    public two_element_show(String drink, String price){
        Drink = drink;
        Price = price;
//        checked.setChecked(check);
    }

    public String GetDrink(){
        String drink = Drink;
        return drink;
    }

    public String GetPrice(){
        String price = Price;
        return price;
    }

//    public boolean GetCheckCondition(){
//        return checked.isChecked();
//    }
}

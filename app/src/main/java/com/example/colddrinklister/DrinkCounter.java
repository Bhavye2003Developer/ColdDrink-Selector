package com.example.colddrinklister;

import android.widget.CheckBox;

public class DrinkCounter {
    int sum = 0;
    CheckBox checkBox;

    public DrinkCounter(CheckBox check) {
        if (check.isChecked()) {
            sum += 1;
        }
    }

    public DrinkCounter() {}
}

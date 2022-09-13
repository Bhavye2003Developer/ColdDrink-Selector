package com.example.colddrinklister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<two_element_show> arr = new ArrayList<>();
        arr.add(new two_element_show("Coffee","451.3"));
        arr.add(new two_element_show("Tea","123.9"));
        arr.add(new two_element_show("Cappucino","324.7"));
        arr.add(new two_element_show("Milk","434.5"));
        arr.add(new two_element_show("Juice","237.5"));
        arr.add(new two_element_show("Lemonade","122.2"));
        arr.add(new two_element_show("MangoShake","233.5"));
        arr.add(new two_element_show("BananaShake","221.1"));

        DrinkCounter drinkCounter = new DrinkCounter();
        TextView text = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        ListView list = findViewById(R.id.root);
        CustomArrayAdapter arrayAdapter = new CustomArrayAdapter(this, arr);
        list.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Your total drinks are : " + Integer.toString(arrayAdapter.GetSumDrinks()));
            }
        });
    }
}
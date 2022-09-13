package com.example.colddrinklister;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<two_element_show> {
    public CustomArrayAdapter(@NonNull Context context, ArrayList<two_element_show> arrayList) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, arrayList);
    }
    final int[] sum = {0};

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_element, parent, false);
        }
        // get the position of the view from the ArrayAdapter
        two_element_show currentNumberPosition = getItem(position);
        TextView textView1 = currentItemView.findViewById(R.id.drink);
        textView1.setText(currentNumberPosition.GetDrink());

        TextView textView2 = currentItemView.findViewById(R.id.price);
        textView2.setText(currentNumberPosition.GetPrice());

        CheckBox check = currentItemView.findViewById(R.id.checkBox);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), currentNumberPosition.GetDrink(), Toast.LENGTH_SHORT).show();
                DrinkCounter drink = new DrinkCounter(check);
                sum[0]++;
            }
        });
        return currentItemView;
    }
    public int GetSumDrinks(){
        return sum[0];
    }
}
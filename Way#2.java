package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
TableLayout t1= (TableLayout)findViewById(R.id.tableLayout);
        TableRow r1= new TableRow(this);
        //View 1
        TextView v1= new TextView(this);
        v1.setTextColor(Color.WHITE); // set the color
        v1.setPadding(5, 5, 5, 5);
        v1.setText("THAT'S ME !!");
        v1.setBackgroundColor(Color.BLACK);
        //View 2
        TextView v2= new TextView(this);
        v2.setTextColor(Color.WHITE); // set the color
        v2.setPadding(5, 5, 5, 5);
        v2.setText("HI AGAIN !!");
        v2.setBackgroundColor(Color.BLACK);

        r1.addView(v1);
        r1.addView(v2);
        t1.addView(r1 ,  new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.MATCH_PARENT));
        
        //The bellow example will show how to generate with multi #
        int i=0;
        while (i<3)                 //Assuming the number i need to generate is 3
        {
        v2= new TextView(this);
        v2.setTextColor(Color.WHITE); // set the color
        v2.setPadding(5, 5, 5, 5);
        v2.setText("HI AGAIN !!");
        v2.setBackgroundColor(Color.BLACK);
           //Hint, you can minimze this step and create layout file that has this style of TextView
        r1.addView(v2);
        t1.addView(r1 ,  new TableLayout.LayoutParams(TableLayout.LayoutParams.FILL_PARENT, TableLayout.LayoutParams.MATCH_PARENT));     
        }
 }
}
//The difference is this solution shows the views next to each other 

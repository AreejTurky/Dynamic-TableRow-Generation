package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

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
        List<String> temp= new ArrayList<>();
       /* try
        {
            AssetManager am= getAssets();
            InputStream is= am.open("text.txt ");
            Scanner sc = new Scanner(is);
            while (sc.hasNextLine()) {
                temp.add(sc.nextLine());
            }
        }
        catch (Exception e) { System.out.println("ERROR!!!: "+e); }

        */

        addTableRow();
    }
    private void addTableRow() {
        LayoutInflater inflater = getLayoutInflater();
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        TableRow.LayoutParams rowParams = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, 0, 1f );
        //Header's rows
        TableRow tableRow1 = (TableRow)inflater.inflate(R.layout.item_stream_row, tableLayout, false);
        tableRow1.setLayoutParams(rowParams);
        //فاتح
        TableRow tableRow2 = (TableRow)inflater.inflate(R.layout.item_stream_row2, tableLayout, false);
        tableRow2.setLayoutParams(rowParams);
        //غامق
        TableRow tableRow3 = (TableRow)inflater.inflate(R.layout.item_stream_row3, tableLayout, false);
        tableRow3.setLayoutParams(rowParams);

        TextView t1=(TextView)findViewById(R.id.textView16);


        tableLayout.addView(tableRow1);
        tableLayout.addView(tableRow2);
        tableLayout.addView(tableRow3);
        int i=0;
        while (i <3)
        {
            tableRow1 = (TableRow)inflater.inflate(R.layout.item_stream_row, tableLayout, false);
            tableRow3 = (TableRow)inflater.inflate(R.layout.item_stream_row3, tableLayout, false);
            tableLayout.addView(tableRow1);
            tableLayout.addView(tableRow3);
            i++;
        }


    }
}
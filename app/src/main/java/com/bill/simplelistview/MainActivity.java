package com.bill.simplelistview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);

        //define an array with values that show the list view

        String[] planets = new String[] {
                "Mercury" ,
                "Venus" ,
                "Earth" ,
                "Mars" ,
                "Jupiter" ,
                "Saturn" ,
                "Uranus" ,
                "Neptune" ,
                 "Pluto"
        };
        //Define an adaptor
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,planets);

        //Assign adapter to listview
        listView.setAdapter(adapter);

        //ListView item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue =  (String)listView.getItemAtPosition(position);

                //show a toast notification of the value
                //Toast.makeText(getApplicationContext(), "Position.." +itemPosition+ "is planet :" +itemValue, Toast.LENGTH_LONG).show();
                //show a snackbar notification of the value
                Snackbar.make(view, "Planet " + itemValue, Snackbar.LENGTH_LONG).show();

            }
        });
    }
}

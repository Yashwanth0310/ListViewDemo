package com.example.listviedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Nick");
        myFamily.add("Sarah");
        myFamily.add("Tom");
        myFamily.add("fido");
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, myFamily);
        myListView.setAdapter(myArrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.i("Person Selected", myFamily.get(i));
                Toast.makeText(MainActivity.this, "Person Selected - "+ myFamily.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}
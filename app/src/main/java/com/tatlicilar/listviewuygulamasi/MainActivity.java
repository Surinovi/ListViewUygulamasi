package com.tatlicilar.listviewuygulamasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView ulkeler;
    ArrayAdapter<String> myAdaptor;
    ArrayList<String> ulkeIsmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ulkeler = (ListView) findViewById(R.id.lv1);

        ulkeIsmi = new ArrayList<String>();

        ulkeIsmi.add("Türkiye");
        ulkeIsmi.add("ABD");
        ulkeIsmi.add("Çin");
        ulkeIsmi.add("Mısır");

        myAdaptor = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ulkeIsmi);

        ulkeler.setAdapter(myAdaptor);

        ulkeler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Toast.makeText(MainActivity.this, ulkeIsmi.get(position), Toast.LENGTH_SHORT).show();
                }
             }
        );

    }
}

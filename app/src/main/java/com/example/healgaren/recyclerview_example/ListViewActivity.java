package com.example.healgaren.recyclerview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        listView = findViewById(R.id.listView);

        adapter = new ListViewAdapter();
        listView.setAdapter(adapter);

    }
}

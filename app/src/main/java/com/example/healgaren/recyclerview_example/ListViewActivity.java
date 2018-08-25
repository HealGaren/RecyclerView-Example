package com.example.healgaren.recyclerview_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;

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

        adapter.addAllTodo(Arrays.asList(
                new TodoVo("a", "안녕하세요"),
                new TodoVo("asdf", "안asd"),
                new TodoVo("zz", "안녕sadf"),
                new TodoVo("dd", "안zz세요"),
                new TodoVo("ff", "안녕z세요")
        ));

        for (int i = 0; i < 100; i++) {
            adapter.addTodo(new TodoVo("title" + i, "content" + i));
        }

    }
}

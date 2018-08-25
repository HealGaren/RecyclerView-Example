package com.example.healgaren.recyclerview_example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    List<TodoVo> todoList = new ArrayList<>();


    public void addTodo(TodoVo todo) {
        todoList.add(todo);
    }

    public void addAllTodo(List<TodoVo> todoList) {
        this.todoList.addAll(todoList);
    }

    @Override
    public int getCount() {
        return todoList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_todo, parent, false);


        TextView textTitle = view.findViewById(R.id.textTodoTitle);
        TextView textContent = view.findViewById(R.id.textTodoContent);

        TodoVo todo = todoList.get(position);

        textTitle.setText(todo.getTitle());
        textContent.setText(todo.getContent());

        return view;
    }
}

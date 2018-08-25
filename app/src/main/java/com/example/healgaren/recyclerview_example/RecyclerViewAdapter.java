package com.example.healgaren.recyclerview_example;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<TodoVo> todoList = new ArrayList<>();


    public void addTodo(TodoVo todo) {
        todoList.add(todo);
    }

    public void addAllTodo(List<TodoVo> todoList) {
        this.todoList.addAll(todoList);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_todo, parent, false);

        Log.d("YEC", "onCreateViewHolder 실행");

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TodoVo todo = todoList.get(position);

        holder.textTitle.setText(todo.getTitle());
        holder.textContent.setText(todo.getContent());

        Log.d("YEC", position + "번째 아이템의 onBindViewHolder 실행");
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textTitle;
        TextView textContent;

        public ViewHolder(View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTodoTitle);
            textContent = itemView.findViewById(R.id.textTodoContent);
            Log.d("YEC", "findViewById 실행");
        }

    }
}

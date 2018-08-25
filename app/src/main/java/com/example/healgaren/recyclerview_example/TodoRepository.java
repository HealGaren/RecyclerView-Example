package com.example.healgaren.recyclerview_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoRepository {

    public final static List<TodoVo> mockTodoList = new ArrayList<>();

    static {
        mockTodoList.addAll(Arrays.asList(
                new TodoVo("a", "안녕하세요"),
                new TodoVo("asdf", "안asd"),
                new TodoVo("zz", "안녕sadf"),
                new TodoVo("dd", "안zz세요"),
                new TodoVo("ff", "안녕z세요")
        ));


        for (int i = 0; i < 100; i++) {
            mockTodoList.add(new TodoVo("title" + i, "content" + i));
        }
    }
}

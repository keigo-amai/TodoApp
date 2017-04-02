package com.amadroid.todoapp.repositry;

import com.amadroid.todoapp.model.Todo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Keigo Amai on 2017/03/30.
 */

public class TodoMock implements TodoDataSource {

    private static final List<Todo> MOCK_LIST = new ArrayList<>();
    private static final String[] DEFAULT_TITLES = new String[] {
            "すごく重要な仕事",
            "まあまあ重要な仕事",
            "普通の仕事",
            "あまり重要じゃない仕事",
            "どうでもいい仕事",
    };

    static {
        long i = 0;
        for (String title : DEFAULT_TITLES) {
            MOCK_LIST.add(new Todo(i, title, false));
            i++;
        }
    }

    public TodoMock() {
    }

    @Override
    public List<Todo> findAll() {
        return MOCK_LIST;
    }

    @Override
    public Todo findById(long id) {
        return MOCK_LIST.get((int) id);
    }

    @Override
    public int insert(String title, boolean isChecked) {
        MOCK_LIST.add(new Todo(MOCK_LIST.size(), title, isChecked));
        return MOCK_LIST.size();
    }

    @Override
    public boolean delete(long id) {
        MOCK_LIST.remove((int) id);
        return true;
    }

    @Override
    public void checked(long id, boolean isChecked) {
        findById(id).isChecked = isChecked;
    }

    @Override
    public void update(long id, String title) {
        findById(id).title = title;
    }
}

package com.amadroid.todoapp.repositry;

import com.amadroid.todoapp.model.Todo;

import java.util.List;

/**
 * Created by Keigo Amai on 2017/03/30.
 */

public interface TodoDataSource {
    List<Todo> findAll();
    Todo findById(long id);
    int insert(String title, boolean isChecked);
    boolean delete(long id);
    void checked(long id, boolean isChecked);
    void update(long id, String title);
}

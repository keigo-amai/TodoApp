package com.amadroid.todoapp.model;

/**
 * Created by Keigo Amai on 2017/03/30.
 */

public class Todo {
    public long id;
    public String title;
    public boolean isChecked;

    public Todo(long id, String title, boolean isChecked) {
        this.id = id;
        this.title = title;
        this.isChecked = isChecked;
    }
}

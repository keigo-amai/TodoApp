package com.amadroid.todoapp.di;

import com.amadroid.todoapp.view.MainActivity;

import dagger.Component;

/**
 * Created by Keigo Amai on 2017/03/30.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}

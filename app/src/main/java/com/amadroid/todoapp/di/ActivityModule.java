package com.amadroid.todoapp.di;

import com.amadroid.todoapp.repositry.TodoDataSource;
import com.amadroid.todoapp.repositry.TodoMock;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Keigo Amai on 2017/03/30.
 */

@Module
public class ActivityModule {

    @Provides
    public TodoDataSource provideDataSource() {
//        return new TodoApiService();
//        return new TodoDatabase();
        return new TodoMock();
    }
}

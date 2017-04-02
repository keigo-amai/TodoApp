package com.amadroid.todoapp.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amadroid.todoapp.R;
import com.amadroid.todoapp.databinding.ViewTodoBinding;
import com.amadroid.todoapp.repositry.TodoDataSource;

import javax.inject.Inject;

/**
 * Created by Keigo Amai on 2017/03/30.
 */
public class MyAdapter extends RecyclerView.Adapter {

    @Inject
    TodoDataSource dataSource;

    @Inject
    public MyAdapter(TodoDataSource todoDataSource) {
        this.dataSource = todoDataSource;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewTodoBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.view_todo, parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewTodoBinding binding = DataBindingUtil.findBinding(holder.itemView);
        binding.setViewModel(dataSource.findById(position));
    }

    @Override
    public int getItemCount() {
        return dataSource.findAll().size();
    }

    public void insert() {
        int insertPosition = dataSource.insert("超どうでもいい仕事", false);
        if (insertPosition != -1) {
            notifyItemInserted(insertPosition);
        }
    }

    private static class ViewHolder extends RecyclerView.ViewHolder {
         ViewHolder(View itemView) {
            super(itemView);
        }
    }
}

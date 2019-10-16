package com.example.medinin.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medinin.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHandler> {

Context context;
    public RecyclerAdapter() {
    }

    @NonNull
    @Override
    public MyHandler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.activity_main,viewGroup,false);
        MyHandler myHandler=new MyHandler(view);
        return myHandler;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHandler viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyHandler extends RecyclerView.ViewHolder {
        public MyHandler(@NonNull View itemView) {
            super(itemView);
        }
    }
}

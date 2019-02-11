package com.example.jack.testarinfo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jack.testarinfo.R;
import com.example.jack.testarinfo.model.Model;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<Model> arrayList = new ArrayList<>();
    Context context;



    public Adapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.lblbname.setText(arrayList.get(position).getName());
        holder.lblsalary.setText(arrayList.get(position).getSalary());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

package com.example.jack.testarinfo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.jack.testarinfo.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView lblbname,lblsalary;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        lblbname = itemView.findViewById(R.id.lblname);
        lblsalary = itemView.findViewById(R.id.lblsalary);

    }
}

package com.example.nutriorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutriorder.Models.Mainmodel;
import com.example.nutriorder.R;

import java.util.ArrayList;

public class Mainadapter extends RecyclerView.Adapter<Mainadapter.viewholder> {
    ArrayList<Mainmodel> list;

    Context context;

    public Mainadapter(ArrayList<Mainmodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final Mainmodel model =list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView foodimage;
        TextView mainName,price,description;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.imageView2);
            mainName=itemView.findViewById(R.id.name);
            price=itemView.findViewById(R.id.orderprice);
            description=itemView.findViewById(R.id.descriptions);
        }
    }
}

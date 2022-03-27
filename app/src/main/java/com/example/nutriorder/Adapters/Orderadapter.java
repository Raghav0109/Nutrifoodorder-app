package com.example.nutriorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutriorder.Models.Ordermodel;
import com.example.nutriorder.R;

import java.util.ArrayList;

public class Orderadapter extends RecyclerView.Adapter<Orderadapter.viewHolder>{
    @NonNull

    ArrayList<Ordermodel> list;

    public Orderadapter(@NonNull ArrayList<Ordermodel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    Context context;
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_ordersample,parent ,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final  Ordermodel model =list.get(position);
        holder.orderImage.setImageResource(model.getOrderImage());
        holder.soldItemName.setText(model.getSoldItemName());
        holder.price.setText(model.getPrice());
        holder.orderNumber.setText(model.getOrderNumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView orderImage;
        TextView soldItemName,price,orderNumber;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            orderImage = itemView.findViewById(R.id.orderImage);
            soldItemName = itemView.findViewById(R.id.orderItemName);
            price = itemView.findViewById(R.id.orderprice);
            orderNumber = itemView.findViewById(R.id.ordernumber);
        }
    }
}

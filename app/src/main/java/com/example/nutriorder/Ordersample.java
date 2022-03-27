package com.example.nutriorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.nutriorder.Adapters.Orderadapter;
import com.example.nutriorder.Models.Ordermodel;
import com.example.nutriorder.databinding.ActivityOrdersampleBinding;

import java.util.ArrayList;


public class Ordersample extends AppCompatActivity {
    ActivityOrdersampleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrdersampleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Ordermodel> list = new ArrayList<>();
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));
        list.add(new Ordermodel(R.drawable.deserts, "Deserts","90","123456"));

        Orderadapter adapter=new Orderadapter(list,this);
        binding.orderRecyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerview.setLayoutManager(layoutManager);

    }
}
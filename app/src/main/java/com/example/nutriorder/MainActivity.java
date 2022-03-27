 package com.example.nutriorder;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.nutriorder.Adapters.Mainadapter;
import com.example.nutriorder.Models.Mainmodel;
import com.example.nutriorder.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Mainmodel> list =new ArrayList<>();

        list.add(new Mainmodel(R.drawable.deserts, "Deserts","90","smoothie like texture of rice pudding with milk"));
        list.add(new Mainmodel(R.drawable.biryani, "Biryani","80","grilled chicken in delicious biryani"));
        list.add(new Mainmodel(R.drawable.noodles, "Noodles","50","special hakka noodles"));
        list.add(new Mainmodel(R.drawable.kulchas, "Kulchae","120","great kulche with dildaar chole"));
        list.add(new Mainmodel(R.drawable.kolhapuri, "Kolhapuri","90","mixture of tempting veggies"));
        list.add(new Mainmodel(R.drawable.dosa, "Dosa","30","buttery and cheesy dosa"));
        list.add(new Mainmodel(R.drawable.cake, "Cakes","90","variety of cakes and pastries"));
        list.add(new Mainmodel(R.drawable.chickenmalai, "Chicken Malai","90","delicious leg pieces with buttery flavoured esssence"));


        Mainadapter adapter=new Mainadapter(list,this);
        binding.recylerview.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);





    }
}
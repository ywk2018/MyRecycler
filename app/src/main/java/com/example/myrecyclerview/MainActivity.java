package com.example.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyFruit> mFruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(mFruits);
        recyclerView.setAdapter(fruitAdapter);

    }

    private void initFruit() {
        for (int i = 0; i < 10; i++) {
            MyFruit apple = new MyFruit("apple", R.mipmap.apple);
            mFruits.add(apple);
            MyFruit banana = new MyFruit("banana", R.mipmap.banana);
            mFruits.add(banana);
            MyFruit orange = new MyFruit("orange", R.mipmap.oriange);
            mFruits.add(orange);
            MyFruit cherry = new MyFruit("cherry", R.mipmap.cherry);
            mFruits.add(cherry);
            MyFruit melon = new MyFruit("memon", R.mipmap.melon);
            mFruits.add(melon);
        }
    }
}

package com.example.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<MyFruit> mFruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        FruitAdapter fruitAdapter = new FruitAdapter(mFruits);
        recyclerView.setAdapter(fruitAdapter);
    }

    private void initFruit() {
        for (int i = 0; i < 10; i++) {
            MyFruit apple = new MyFruit(getRandom("apple"), R.mipmap.apple);
            mFruits.add(apple);
            MyFruit banana = new MyFruit(getRandom("banana"), R.mipmap.banana);
            mFruits.add(banana);
            MyFruit orange = new MyFruit(getRandom("orange"), R.mipmap.oriange);
            mFruits.add(orange);
            MyFruit cherry = new MyFruit(getRandom("cherry"), R.mipmap.cherry);
            mFruits.add(cherry);
            MyFruit melon = new MyFruit(getRandom("memon"), R.mipmap.melon);
            mFruits.add(melon);
        }
    }

    private String getRandom(String name){

        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        int length = random.nextInt(20) + 1;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(name);
        }
        return stringBuilder.toString();
    }
}

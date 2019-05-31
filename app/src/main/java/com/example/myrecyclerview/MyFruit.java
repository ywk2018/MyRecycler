package com.example.myrecyclerview;

public class MyFruit {

    private String fruitName;
    private int fruitImage;

    public MyFruit(String fruitName, int fruitImage) {
        this.fruitName = fruitName;
        this.fruitImage = fruitImage;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitImage() {
        return fruitImage;
    }
}

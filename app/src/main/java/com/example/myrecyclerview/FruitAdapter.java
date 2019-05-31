package com.example.myrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * class description:
 * author ywk
 * since 2019-05-31
 */
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHoler> {

    private ArrayList<MyFruit> mfuitlist;

    public FruitAdapter(ArrayList fruitlist) {
        mfuitlist = fruitlist;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.fruit_item, viewGroup, false);
        ViewHoler viewHoler = new ViewHoler(view);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHoler viewHoler, int i) {
        final MyFruit myFruit = mfuitlist.get(i);
        viewHoler.fruitIamge.setImageResource(myFruit.getFruitImage());
        viewHoler.fruitName.setText(myFruit.getFruitName());
        viewHoler.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "" + myFruit.getFruitName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mfuitlist.size();
    }

    static class ViewHoler extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView fruitIamge;
        TextView fruitName;

        public ViewHoler(View view) {
            super(view);
            fruitView= view;
            fruitIamge = (ImageView) view.findViewById(R.id.img_fruitImage);
            fruitName = (TextView) view.findViewById(R.id.tv_fruitName);
        }
    }
}


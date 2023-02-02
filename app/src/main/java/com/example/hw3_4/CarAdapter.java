package com.example.hw3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class
CarAdapter extends RecyclerView.Adapter<CarViewHolder> {

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false));
    }

    public ArrayList<Car> arrayList;
    private MainActivity onItemClick;

    public CarAdapter(ArrayList<Car> arrayList, MainActivity onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick = onItemClick;
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClick.onClick(arrayList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

class CarViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView title;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void onBind(Car car) {
        imageView = itemView.findViewById(R.id.imageView_icon);
        title = itemView.findViewById(R.id.text_view_title);
        Glide.with(imageView).load(car.getImage()).into(imageView);
        title.setText(car.getTitle());
    }
}

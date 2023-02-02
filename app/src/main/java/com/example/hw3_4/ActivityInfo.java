package com.example.hw3_4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ActivityInfo extends AppCompatActivity {

    ImageView imageView;
    TextView title;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        findViews();
        getData();
    }

    private void findViews() {
        imageView = findViewById(R.id.imageView_icon);
        title = findViewById(R.id.tv_title_info);
        price = findViewById(R.id.tv_price);
    }

    private void getData() {
        if (getIntent().getSerializableExtra("car") != null) {
            Car car = (Car) getIntent().getSerializableExtra("car");
            Glide.with(this).load(car.getImage()).into(imageView);
            title.setText(car.getTitle());
            price.setText(car.getPrice());
        }
    }
}

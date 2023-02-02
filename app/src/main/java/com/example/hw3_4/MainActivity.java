package com.example.hw3_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<Car> arrayList;
    private CarAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        fillList();
        setAdapter();
    }

    private void findViews(){
        recyclerView =findViewById(R.id.recycler_view);
    }

    private void fillList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Car("https://i.cars.kg/preview/r/ZDXFmPPgK9HoWmLzosJx_A/1080x-/20230130/0dfac31c47322080bb8e94de6829cc1b.jpg",
                "Honda Accord","Price: 10,000$"));
        arrayList.add(new Car("https://www.google.com/url?sa=i&url=https%3A%2F%2Fcars.usnews.com%2Fcars-trucks%2Fjeep%2Fwrangler&psig=AOvVaw3bCqYsGtHk946_NY-diLyZ&ust=1675421561095000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCLjX_LSx9vwCFQAAAAAdAAAAABAE",
                "Jeep","Price: 11,000$"));
        arrayList.add(new Car("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.autocentre.ua%2Fused%2Fobzor%2Flexus-is-200-klassiki-i-sovremenniki-285922.html&psig=AOvVaw3OtQev_nRX1yrIrAwldXVp&ust=1675421653165000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCMigzuCx9vwCFQAAAAAdAAAAABAR",
                "lexus is 200","Price: 7,000$"));
        arrayList.add(new Car("https://www.google.com/url?sa=i&url=https%3A%2F%2Fauto.ru%2Fcatalog%2Fcars%2Ftoyota%2Fcamry%2F&psig=AOvVaw1Ecn94zVsHZyoFCBLEhzPm&ust=1675421748442000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCKDx5Y2y9vwCFQAAAAAdAAAAABAE",
                "Toyota camry","Price: 13,000$"));
        arrayList.add(new Car("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.topgear.com%2Fcar-reviews%2Fsubaru%2Fwrx-sti&psig=AOvVaw3PWxbYFxKa__MsXMoyO0ol&ust=1675421784495000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCND5p5-y9vwCFQAAAAAdAAAAABAE",
                "Subaru","Price: 9,000$"));
        arrayList.add(new Car("https://www.google.com/url?sa=i&url=https%3A%2F%2Fauto.ru%2Fcatalog%2Fcars%2Fkia%2Fk7%2F&psig=AOvVaw0Z_5zHS6Qcu-NuX0E5Jd7P&ust=1675421881624000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCMiq0c2y9vwCFQAAAAAdAAAAABAE",
                "Kia k7","Price: 13,000$"));
        arrayList.add(new Car("https://www.google.com/imgres?imgurl=https%3A%2F%2Fmedia.ed.edmunds-media.com%2Fmazda%2F6%2F2021%2Foem%2F2021_mazda_6_sedan_carbon-edition_fq_oem_1_1280.jpg&imgrefurl=https%3A%2F%2Fwww.edmunds.com%2Fmazda%2F6%2F&tbnid=3ob2jwmpZTVFlM&vet=12ahUKEwjf_N-M1_b8AhUqDBAIHdOCCvYQMygDegUIARDjAQ..i&docid=qFXbP7GjnMtfAM&w=1280&h=855&q=mazda&ved=2ahUKEwjf_N-M1_b8AhUqDBAIHdOCCvYQMygDegUIARDjAQ",
                "Mazda","Price: 6,000$"));
    }

    private void setAdapter() {
        adapter = new CarAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);
    }

    public void onClick(Car car) {
        Intent intent = new Intent(MainActivity.this,ActivityInfo.class);
        intent.putExtra("car", car);
        startActivity(intent);
    }
}
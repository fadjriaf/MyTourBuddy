package com.fadjriaf.mytourbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class TourDetail extends AppCompatActivity {
    TextView tourName, tourDescript, tourLoc, tourHours, tourTicket, tourActivity;
    ImageView tourImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_detail);
        Tour tour = getIntent().getParcelableExtra("key");

        tourImage = findViewById(R.id.img_item);
        tourName = findViewById(R.id.tv_tour_name);
        tourDescript = findViewById(R.id.tv_tour_descript);
        tourLoc = findViewById(R.id.tv_tour_location);
        tourHours = findViewById(R.id.tv_tour_hours);
        tourTicket = findViewById(R.id.tv_tour_ticket);
        tourActivity = findViewById(R.id.tv_tour_activity);

        Glide.with(this)
                .load(tour.getTourImage())
                .apply(new RequestOptions().override(0,0))
                .into(tourImage);

        tourName.setText(tour.getTourName());
        tourDescript.setText(tour.getTourDescript());
        tourLoc.setText(tour.getTourLoc());
        tourHours.setText(tour.getTourHours());
        tourTicket.setText(tour.getTourTicket());
        tourActivity.setText(tour.getTourActivity());

        Log.i("image", tour.getTourImage());
        Log.i("tour", tour.getTourName());
    }
}

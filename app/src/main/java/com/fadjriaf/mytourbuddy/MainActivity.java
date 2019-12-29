package com.fadjriaf.mytourbuddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTour;
    private ArrayList<Tour> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTour = findViewById(R.id.rv_tour);
        rvTour.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(TourData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvTour.setLayoutManager(new LinearLayoutManager(this));
        TourAdapter tour = new TourAdapter(this);
        tour.setListTour(list);
        rvTour.setAdapter(tour);

        ItemClickSupport.addTo(rvTour).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedDetailTour(list.get(position));
            }
        });
    }

    private void showSelectedDetailTour(Tour tour){
        Intent moveDetail = new Intent(MainActivity.this, TourDetail.class);
        moveDetail.putExtra("key", tour);
        startActivity(moveDetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

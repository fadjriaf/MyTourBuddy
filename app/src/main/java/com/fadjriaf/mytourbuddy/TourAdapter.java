package com.fadjriaf.mytourbuddy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class TourAdapter extends RecyclerView.Adapter<TourAdapter.TourViewHolder>{
    private Context context;
    private ArrayList<Tour> listTour;

    TourAdapter(Context context){
        this.context = context;
    }

    private ArrayList<Tour> getListTour(){
        return listTour;
    }

    void setListTour(ArrayList<Tour> listTour){
        this.listTour = listTour;
    }

    @NonNull
    @Override
    public TourViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_tour, parent, false);
        return new TourViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TourViewHolder holder, int position){
        final Tour tour = getListTour().get(position);

        Glide.with(context)
                .load(tour.getTourImage())
                .apply(new RequestOptions(). override(350, 550))
                .into(holder.imageTour);

        holder.tvTourName.setText(tour.getTourName());
        holder.tour = tour;
    }

    @Override
    public int getItemCount(){
        return getListTour().size();
    }

    public class TourViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageTour;
        TextView tvTourName;
        Tour tour;

        TourViewHolder(@NonNull View itemView){
            super(itemView);
            imageTour = itemView.findViewById(R.id.img_item);
            tvTourName = itemView.findViewById(R.id.tv_tour_name);
        }

        @Override
        public void onClick(View v){
            Intent tourDetail = new Intent(context, TourDetail.class);
            tourDetail.putExtra("key", tour);
            context.startActivity(tourDetail);
        }
    }
}

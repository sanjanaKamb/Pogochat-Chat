package com.nullterminator.pogochat;

/**
 * Created by Rayun on 2016-07-17.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GymsAdapter extends RecyclerView.Adapter<GymsAdapter.MyViewHolder> {

    private List<GymLocation> gymsList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView latlong, distance;

        public MyViewHolder(View view) {
            super(view);
            latlong = (TextView) view.findViewById(R.id.latlong);
            distance = (TextView) view.findViewById(R.id.distance);
        }
    }


    public GymsAdapter(List<GymLocation> gymsList) {
        this.gymsList = gymsList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gym_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        GymLocation gym = gymsList.get(position);
        holder.latlong.setText(gym.getLat()+", "+gym.getLong());
        holder.distance.setText("Distance"); //TODO
    }

    @Override
    public int getItemCount() {
        return gymsList.size();
    }
}

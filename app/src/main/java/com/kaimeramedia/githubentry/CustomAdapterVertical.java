package com.kaimeramedia.githubentry;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapterVertical extends RecyclerView.Adapter<CustomAdapterVertical.MyViewHolder> {

    private ArrayList<DataClass> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            //this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (getPosition() == 0) {
                        Toast.makeText(v.getContext(), " On CLick one", Toast.LENGTH_SHORT).show();

                    }
                    if (getPosition() == 1) {
                        Toast.makeText(v.getContext(), " On CLick Two", Toast.LENGTH_SHORT).show();

                    }
                    if (getPosition() == 2) {
                        Toast.makeText(v.getContext(), " On CLick Three", Toast.LENGTH_SHORT).show();

                    }
                    if (getPosition() == 3) {
                        Toast.makeText(v.getContext(), " On CLick Fore", Toast.LENGTH_SHORT).show();

                    }

                }
            });
        }
    }

    public CustomAdapterVertical(ArrayList<DataClass> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        // TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;
        imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
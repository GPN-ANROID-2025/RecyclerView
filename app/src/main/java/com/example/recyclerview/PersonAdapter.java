package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>{

    ArrayList<Person> list;
    public PersonAdapter(ArrayList<Person> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position) {

        holder.tvName.setText(list.get(position).getName());
        holder.tvAge.setText(""+list.get(position).getAge());
        holder.imageViewProfile.setImageResource(list.get(position).imageId);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(holder.itemView.getContext(), ""+list.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        holder.imageViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), "Hello "+list.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewProfile;
        TextView tvName;
        TextView tvAge;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvName=itemView.findViewById(R.id.tvName);
            imageViewProfile=itemView.findViewById(R.id.imageViewProfile);
        }
    }
}

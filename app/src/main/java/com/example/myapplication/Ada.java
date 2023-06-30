package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class Ada extends RecyclerView.Adapter<Ada.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Ani> animals;

    public Ada(Context context, List<Ani>animals){
        this.inflater = LayoutInflater.from(context);
        this.animals = animals;
    }


    @Override
    public Ada.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Ada.ViewHolder holder, int position) {
        Ani ani = animals.get(position);
        holder.animalView.setImageResource(ani.getRes());
        holder.nameView.setText(ani.getName());
        holder.DesView.setText(ani.getDes());
        holder.popView.setText(ani.getpop());

    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView animalView;
        final TextView nameView, DesView, popView;

        ViewHolder(View view){
            super(view);
            animalView = view.findViewById(R.id.Res);
            nameView = view.findViewById(R.id.name);
            DesView = view.findViewById(R.id.Des);
            popView = view.findViewById(R.id.pop);
        }
    }
}

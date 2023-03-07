package com.example.final_proyect.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.final_proyect.R;
import com.example.final_proyect.model.fruit;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class fruitAdapter extends FirestoreRecyclerAdapter<fruit, fruitAdapter.ViewHolder> {
    public fruitAdapter(@NonNull FirestoreRecyclerOptions<fruit> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull fruit fruit) {
        holder.name.setText(fruit.getName());
        //holder.image.setText(fruit.getImage());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        return new ViewHolder(v);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        //image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.item_name);
            //image = itemView.findViewById(R.id.imageView);
        }
    }
}

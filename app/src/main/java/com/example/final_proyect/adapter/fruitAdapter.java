package com.example.final_proyect.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.final_proyect.R;
import com.example.final_proyect.model.product;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class fruitAdapter extends FirestoreRecyclerAdapter<product, fruitAdapter.ViewHolder> {
    public fruitAdapter(@NonNull FirestoreRecyclerOptions<product> options) {
        super(options);
    }

    //FirebaseFirestore mFirestore = FirebaseFirestore.getInstance();

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull product fruit) {
        holder.name.setText(fruit.getName());
        //holder.image.setText(fruit.getImage());

        //holder.btn_add.setOnClickListener(this);

    }

    /*@Override
    public void onClick(View v) {
        Map<String, Object> user = new HashMap<>();
        user.put("first", "Ada");
        user.put("last", "Lovelace");
        user.put("born", 1815);
        mFirestore.collection("Shopping")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(v.getContext(), "Registrado", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(v.getContext(), "Error", Toast.LENGTH_SHORT).show();
                    }
                });

    }*/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        return new ViewHolder(v);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        //image;
        Button btn_add;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.item_name);
            //image = itemView.findViewById(R.id.imageView);
            //btn_add = itemView.findViewById(R.id.addImageButton);
        }
    }
}

package com.example.final_proyect;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_proyect.adapter.fruitAdapter;
import com.example.final_proyect.model.fruit;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class ShoppingActivity extends AppCompatActivity {

    RecyclerView mRecycler;
    fruitAdapter mAdapter;
    FirebaseFirestore mFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);mFirestore = FirebaseFirestore.getInstance();
        mRecycler = findViewById(R.id.listProducts);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        Query query = mFirestore.collection("fruit");

        FirestoreRecyclerOptions<fruit> firestoreRecyclerOptions = new FirestoreRecyclerOptions.Builder<fruit>().setQuery(query, fruit.class).build();

        mAdapter = new fruitAdapter(firestoreRecyclerOptions);
        mAdapter.notifyDataSetChanged();
        mRecycler.setAdapter(mAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAdapter.stopListening();
    }
}
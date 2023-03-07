package com.example.final_proyect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.final_proyect.adapter.fruitAdapter;
import com.example.final_proyect.model.product;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class FruitActivity extends AppCompatActivity {

    RelativeLayout imgWallet,imgTodo,imgPantry,imgFridge;
    RecyclerView mRecycler;
    fruitAdapter mAdapter;
    FirebaseFirestore mFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        imgFridge = (RelativeLayout) findViewById(R.id.fridgeImg);
        imgWallet = (RelativeLayout) findViewById(R.id.walletImg);
        imgTodo = (RelativeLayout) findViewById(R.id.todoImg);
        imgPantry = (RelativeLayout) findViewById(R.id.pantryImg);

        mFirestore = FirebaseFirestore.getInstance();
        mRecycler = findViewById(R.id.listFruits);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        Query query = mFirestore.collection("fruit");

        imgFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FruitActivity.this,FridgeActivity.class);
                startActivity(intent);
            }
        });
        imgWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FruitActivity.this,BillActivity.class);
                startActivity(intent);
            }
        });
        imgTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FruitActivity.this,TodoActivity.class);
                startActivity(intent);
            }
        });
        imgPantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FruitActivity.this,PantryActivity.class);
                startActivity(intent);
            }
        });

        FirestoreRecyclerOptions<product> firestoreRecyclerOptions = new FirestoreRecyclerOptions.Builder<product>().setQuery(query, product.class).build();

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
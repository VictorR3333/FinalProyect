package com.example.final_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class TodoActivity extends AppCompatActivity {

    RelativeLayout imgWallet,imgShopping,imgPantry,imgFridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        imgFridge = (RelativeLayout) findViewById(R.id.fridgeImg);
        imgWallet = (RelativeLayout) findViewById(R.id.walletImg);
        imgShopping = (RelativeLayout) findViewById(R.id.shoppingImg);
        imgPantry = (RelativeLayout) findViewById(R.id.pantryImg);

        imgFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TodoActivity.this,FridgeActivity.class);
                startActivity(intent);
            }
        });
        imgWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TodoActivity.this,BillActivity.class);
                startActivity(intent);
            }
        });
        imgShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TodoActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });
        imgPantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TodoActivity.this,PantryActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.final_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class PantryActivity extends AppCompatActivity {

    RelativeLayout imgWallet,imgTodo,imgShopping,imgFridge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantry);

        imgFridge = (RelativeLayout) findViewById(R.id.fridgeImg);
        imgWallet = (RelativeLayout) findViewById(R.id.walletImg);
        imgTodo = (RelativeLayout) findViewById(R.id.todoImg);
        imgShopping = (RelativeLayout) findViewById(R.id.shoppingImg);

        imgFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PantryActivity.this,FridgeActivity.class);
                startActivity(intent);
            }
        });
        imgWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PantryActivity.this,BillActivity.class);
                startActivity(intent);
            }
        });
        imgTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PantryActivity.this,TodoActivity.class);
                startActivity(intent);
            }
        });
        imgShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PantryActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });
    }
}
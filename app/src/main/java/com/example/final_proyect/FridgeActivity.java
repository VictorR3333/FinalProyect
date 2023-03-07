package com.example.final_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class FridgeActivity extends AppCompatActivity {

    RelativeLayout imgPantry,imgWallet,imgTodo,imgShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);

        imgPantry = (RelativeLayout) findViewById(R.id.pantryImg);
        imgWallet = (RelativeLayout) findViewById(R.id.walletImg);
        imgTodo = (RelativeLayout) findViewById(R.id.todoImg);
        imgShopping = (RelativeLayout) findViewById(R.id.shoppingImg);

        imgPantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FridgeActivity.this,PantryActivity.class);
                startActivity(intent);
            }
        });
        imgWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FridgeActivity.this,BillActivity.class);
                startActivity(intent);
            }
        });
        imgTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FridgeActivity.this,TodoActivity.class);
                startActivity(intent);
            }
        });
        imgShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FridgeActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });
    }
}
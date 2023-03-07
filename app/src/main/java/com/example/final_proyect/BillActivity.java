package com.example.final_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class BillActivity extends AppCompatActivity {

    RelativeLayout imgPantry,imgFridge,imgTodo,imgShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        imgPantry = (RelativeLayout) findViewById(R.id.pantryImg);
        imgFridge = (RelativeLayout) findViewById(R.id.fridgeImg);
        imgTodo = (RelativeLayout) findViewById(R.id.todoImg);
        imgShopping = (RelativeLayout) findViewById(R.id.shoppingImg);

        imgPantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillActivity.this,PantryActivity.class);
                startActivity(intent);
            }
        });
        imgFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillActivity.this, FridgeActivity.class);
                startActivity(intent);
            }
        });
        imgTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillActivity.this,TodoActivity.class);
                startActivity(intent);
            }
        });
        imgShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BillActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });
    }
}
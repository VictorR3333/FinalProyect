package com.example.final_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    Button btnBill,btnPantry,btnFridge,btnChores,btnShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        btnBill = (Button)findViewById(R.id.buttonBill);
        btnPantry = (Button)findViewById(R.id.buttonPantry);
        btnFridge = (Button)findViewById(R.id.buttonFridge);
        btnChores = (Button)findViewById(R.id.buttonChores);
        btnShopping = (Button)findViewById(R.id.buttonShopping);

        btnBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this,BillActivity.class);
                startActivity(intent);
            }
        });
        btnPantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this,PantryActivity.class);
                startActivity(intent);
            }
        });
        btnFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this,FridgeActivity.class);
                startActivity(intent);
            }
        });
        btnChores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this,TodoActivity.class);
                startActivity(intent);
            }
        });
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectActivity.this,ShoppingActivity.class);
                startActivity(intent);
            }
        });
    }
}
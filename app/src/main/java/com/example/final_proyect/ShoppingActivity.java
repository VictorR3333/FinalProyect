package com.example.final_proyect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ShoppingActivity extends AppCompatActivity {

    RelativeLayout imgWallet,imgTodo,imgPantry,imgFridge;
    ImageView fruitView,dairyView,drinkView,vegView,meatView,fishView,spicyView,
    breadView,alcoholView,sauceView,nutsView,breakfastView,frozenView,hygieneView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        imgFridge = (RelativeLayout) findViewById(R.id.fridgeImg);
        imgWallet = (RelativeLayout) findViewById(R.id.walletImg);
        imgTodo = (RelativeLayout) findViewById(R.id.todoImg);
        imgPantry = (RelativeLayout) findViewById(R.id.pantryImg);

        fruitView =(ImageView) findViewById(R.id.fruitImageView);
        dairyView =(ImageView) findViewById(R.id.fruitImageView);
        drinkView =(ImageView) findViewById(R.id.fruitImageView);
        vegView =(ImageView) findViewById(R.id.fruitImageView);
        meatView =(ImageView) findViewById(R.id.fruitImageView);
        fishView =(ImageView) findViewById(R.id.fruitImageView);
        spicyView =(ImageView) findViewById(R.id.fruitImageView);
        breadView =(ImageView) findViewById(R.id.fruitImageView);
        alcoholView =(ImageView) findViewById(R.id.fruitImageView);
        sauceView =(ImageView) findViewById(R.id.fruitImageView);
        nutsView =(ImageView) findViewById(R.id.fruitImageView);
        breakfastView =(ImageView) findViewById(R.id.fruitImageView);
        frozenView =(ImageView) findViewById(R.id.fruitImageView);
        hygieneView =(ImageView) findViewById(R.id.fruitImageView);

        imgFridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoppingActivity.this,FridgeActivity.class);
                startActivity(intent);
            }
        });
        imgWallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoppingActivity.this,BillActivity.class);
                startActivity(intent);
            }
        });
        imgTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoppingActivity.this,TodoActivity.class);
                startActivity(intent);
            }
        });
        imgPantry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoppingActivity.this,PantryActivity.class);
                startActivity(intent);
            }
        });

        fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        dairyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,DairyActivity.class);
                startActivity(intent);
            }
        });
        drinkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        vegView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        meatView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        fishView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        spicyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        breadView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        alcoholView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        sauceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        nutsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        breakfastView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        frozenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });
        hygieneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingActivity.this,FruitActivity.class);
                startActivity(intent);
            }
        });

    }
}
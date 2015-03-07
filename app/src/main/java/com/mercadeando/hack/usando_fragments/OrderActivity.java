package com.mercadeando.hack.usando_fragments;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class OrderActivity extends ActionBarActivity {

    ListView listView;
    ArrayList<Products> productsList;

    // Creamos un adapter personalizado
    ProductsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        listView = (ListView) findViewById(R.id.listView);
        productsList = new ArrayList<>();

        // Al adapter personalizado le pasamos el contexto y la lista que contiene
        // Añadimos el adapter al listview
        adapter = new ProductsAdapter(this, productsList);
        listView.setAdapter(adapter);

        productsList.add(new Products(R.drawable.jito, "Jitomates"));


    }
}

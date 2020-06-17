package com.example.savitransperu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListadoViajes extends AppCompatActivity{

    private RecyclerView recView;
    private ArrayList<Titular> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        datos= new ArrayList<Titular>();
        for(int i=0; i<25; i++)
            datos.add(new Titular("Nombre Destino " +i, "Precio"+i, "Asientos Disponibles" +i));


        recView = (RecyclerView) findViewById(R.id.RecView);
        recView.setHasFixedSize(true);

        final AdaptadorTitulares adaptador = new AdaptadorTitulares(datos);
        recView.setAdapter(adaptador);

        recView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        );

    }

}

package com.veronicamachado.mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import Adapter.MascotaAdaptador;
import Pojo.Mascotas;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar();

        listaMascotas = (RecyclerView)findViewById(R.id.rcmasc);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarMascotas();
        inicializarAdaptador();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mabout:
            case R.id.contacto:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void setSupportActionBar() {
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


    public void inicializarMascotas(){

        mascotas = new ArrayList<>();
        mascotas.add(new Mascotas(R.drawable.mascota1,"Laika"));
        mascotas.add(new Mascotas(R.drawable.mascota2,"Toby"));
        mascotas.add(new Mascotas(R.drawable.mascota3,"Sultan"));
        mascotas.add(new Mascotas(R.drawable.mascota4,"Roma"));
        mascotas.add(new Mascotas(R.drawable.mascota5,"Tango"));
    }


}
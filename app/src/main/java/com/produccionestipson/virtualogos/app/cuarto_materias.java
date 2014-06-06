package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;

public class cuarto_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto_materias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void to_cuarto_english_air1 (View view){
        Intent i = new Intent(this, cuarto_english_air1.class);
        startActivity(i);
    }
    public void to_cuarto_english_air2 (View view){
        Intent i = new Intent(this, cuarto_english_air2.class);
        startActivity(i);
    }
    public void to_cuarto_english_air3 (View view){
        Intent i = new Intent(this, cuarto_english_air3.class);
        startActivity(i);
    }
    public void to_cuarto_english_land (View view){
        Intent i = new Intent(this, cuarto_english_land.class);
        startActivity(i);
    }
    public void to_cuarto_es_sociales (View view){
        Intent i = new Intent(this, cuarto_es_sociales.class);
        startActivity(i);
    }
    public void to_cuarto_lenguaje (View view){
        Intent i = new Intent(this, cuarto_lenguaje.class);
        startActivity(i);
    }
    public void to_cuarto_matematicas (View view){
        Intent i = new Intent(this, cuarto_matematicas.class);
        startActivity(i);
    }
    public void to_cuarto_science (View view){
        Intent i = new Intent(this, cuarto_science.class);
        startActivity(i);
    }
}

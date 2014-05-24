package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;

public class quinto_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto_materias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quinto_materias, menu);
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
    public void to_quinto_english_air1 (View view){
        Intent i = new Intent(this, quinto_english_air1.class);
        startActivity(i);
    }
    public void to_quinto_english_air2 (View view){
        Intent i = new Intent(this, quinto_english_air2.class);
        startActivity(i);
    }
    public void to_quinto_english_land (View view){
        Intent i = new Intent(this, quinto_english_land.class);
        startActivity(i);
    }
    public void to_quinto_english_water (View view){
        Intent i = new Intent(this, quinto_english_water.class);
        startActivity(i);
    }
    public void to_quinto_es_sociales (View view){
        Intent i = new Intent(this, quinto_es_sociales.class);
        startActivity(i);
    }
    public void to_quinto_science (View view){
        Intent i = new Intent(this, quinto_science.class);
        startActivity(i);
    }
    public void to_quinto_lenguaje (View view){
        Intent i = new Intent(this, quinto_lenguaje.class);
        startActivity(i);
    }
    public void to_quinto_matematicas_sl (View view){
        Intent i = new Intent(this, quinto_matematicas_sl.class);
        startActivity(i);
    }
    public void to_quinto_matematicas_higher1 (View view){
        Intent i = new Intent(this, quinto_matematicas_higher1.class);
        startActivity(i);
    }
    public void to_quinto_matematicas_higher2 (View view){
        Intent i = new Intent(this, quinto_matematicas_higher2.class);
        startActivity(i);
    }
}
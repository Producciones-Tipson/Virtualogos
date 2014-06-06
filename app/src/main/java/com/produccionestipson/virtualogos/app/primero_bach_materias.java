package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class primero_bach_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero_bach_materias);
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
    public void to_primerobach_biologia (View view){
        Intent i = new Intent(this, primerobach_biologia.class);
        startActivity(i);
    }
    public void to_primerobach_biologiad (View view){
        Intent i = new Intent(this, primerobach_biologiad.class);
        startActivity(i);
    }
    public void to_primerobach_es_sociales (View view){
        Intent i = new Intent(this, primerobach_es_sociales.class);
        startActivity(i);
    }
    public void to_primerobach_lenguaje (View view){
        Intent i = new Intent(this, primerobach_lenguaje.class);
        startActivity(i);
    }
    public void to_primerobach_english_sl (View view){
        Intent i = new Intent(this, primerobach_english_sl.class);
        startActivity(i);
    }
    public void to_primerobach_english_higher (View view){
        Intent i = new Intent(this, primerobach_english_higher.class);
        startActivity(i);
    }
    public void to_primerobach_matematicas_sl (View view){
        Intent i = new Intent(this, primerobach_matematicas_sl.class);
        startActivity(i);
    }
    public void to_primerobach_matematicas_higher (View view){
        Intent i = new Intent(this, primerobach_matematicas_higher.class);
        startActivity(i);
    }
    public void to_primerobach_fisica (View view){
        Intent i = new Intent(this, primerobach_fisica.class);
        startActivity(i);
    }
    public void to_primerobach_quimica (View view){
        Intent i = new Intent(this, primerobach_quimica.class);
        startActivity(i);
    }
    public void to_primerobach_tok_a (View view){
        Intent i = new Intent(this, primerobach_toka.class);
        startActivity(i);
    }
    public void to_primerobach_tok (View view){
        Intent i = new Intent(this, primerobach_tok.class);
        startActivity(i);
    }
}

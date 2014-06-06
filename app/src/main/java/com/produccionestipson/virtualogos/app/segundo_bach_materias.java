package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class segundo_bach_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_bach_materias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        // Inflate the menu; this adds items to the action bar if it is present
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
    public void to_2bach_sis_ambiental (View view){
        Intent i = new Intent(this, segundobach_sis_ambiental.class);
        startActivity(i);
    }
    public void to_2bach_economia (View view){
        Intent i = new Intent(this, segundobach_economia.class);
        startActivity(i);
    }
    public void to_2bach_business (View view){
        Intent i = new Intent(this, segundobach_business.class);
        startActivity(i);
    }
    public void to_2bach_es_sociales (View view){
        Intent i = new Intent(this, segundobach_es_sociales.class);
        startActivity(i);
    }
    public void to_2bach_filosofia (View view){
        Intent i = new Intent(this, segundobach_filosofia.class);
        startActivity(i);
    }
    public void to_2bach_fisica (View view){
        Intent i = new Intent(this, segundobach_fisica.class);
        startActivity(i);
    }
    public void to_2bach_lenguaje (View view){
        Intent i = new Intent(this, segundobach_lenguaje.class);
        startActivity(i);
    }
    public void to_2bach_literature (View view){
        Intent i = new Intent(this, segundobach_literature.class);
        startActivity(i);
    }
    public void to_2bach_englishb (View view){
        Intent i = new Intent(this, segundobach_englishb.class);
        startActivity(i);
    }
    public void to_2bach_es_matematicas (View view){
        Intent i = new Intent(this, segundobach_es_matematicos.class);
        startActivity(i);
    }
    public void to_2bach_matematicas_slab (View view){
        Intent i = new Intent(this, segundobach_matematicas_slab.class);
        startActivity(i);
    }
    public void to_2bach_matematicas_slcd (View view){
        Intent i = new Intent(this, segundobach_matematicas_slcd.class);
        startActivity(i);
    }
    public void to_2bach_tok (View view){
        Intent i = new Intent(this, segundobach_tok.class);
        startActivity(i);
    }
    public void to_2bach_quimica (View view){
        Intent i = new Intent(this, segundobach_quimica.class);
        startActivity(i);
    }
}

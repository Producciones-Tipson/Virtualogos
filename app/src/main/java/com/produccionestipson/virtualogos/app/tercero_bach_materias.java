package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class tercero_bach_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercero_bach_materias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tercero_bach_materias, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void to_3bach_biologia (View view){
        Intent i = new Intent(this, tercerobach_biologia.class);
        startActivity(i);
    }
    public void to_3bach_economics (View view){
        Intent i = new Intent(this, tercerobach_economics.class);
        startActivity(i);
    }
    public void to_3bach_empresa (View view){
        Intent i = new Intent(this, tercerobach_empresas.class);
        startActivity(i);
    }
    public void to_3bach_literature (View view){
        Intent i = new Intent(this, tercerobach_literature.class);
        startActivity(i);
    }
    public void to_3bach_lenguageb (View view){
        Intent i = new Intent(this, tercerobach_lenguageb.class);
        startActivity(i);
    }
    public void to_3bach_es_matematicos (View view){
        Intent i = new Intent(this, tercerobach_es_matematicos.class);
        startActivity(i);
    }
    public void to_3bach_matematicas_slab (View view){
        Intent i = new Intent(this, tercerobach_matematicas_slab.class);
        startActivity(i);
    }
    public void to_3bach_matematicas_slcd (View view){
        Intent i = new Intent(this, tercerobach_matematicas_slcd.class);
        startActivity(i);
    }
    public void to_3bach_tok (View view){
        Intent i = new Intent(this, tercerobach_tok.class);
        startActivity(i);
    }
}

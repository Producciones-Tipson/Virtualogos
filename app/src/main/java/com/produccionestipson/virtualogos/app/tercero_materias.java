package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;
import com.produccionestipson.virtualogos.app.tercero_english_a;
import com.produccionestipson.virtualogos.app.tercero_english_b;
import com.produccionestipson.virtualogos.app.tercero_english_cd;
import com.produccionestipson.virtualogos.app.tercero_environment;
import com.produccionestipson.virtualogos.app.tercero_lenguaje_ab;
import com.produccionestipson.virtualogos.app.tercero_lenguaje_cd;
import com.produccionestipson.virtualogos.app.tercero_matematicas;

public class tercero_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercero_materias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
    public void to_tercero_english_a (View view){
        Intent i = new Intent(this, tercero_english_a.class);
        startActivity(i);
    }
    public void to_tercero_english_b (View view){
        Intent i = new Intent(this, tercero_english_b.class);
        startActivity(i);
    }
    public void to_tercero_english_cd (View view){
        Intent i = new Intent(this, tercero_english_cd.class);
        startActivity(i);
    }
    public void to_tercero_environment (View view){
        Intent i = new Intent(this, tercero_environment.class);
        startActivity(i);
    }
    public void to_tercero_lenguaje_ab (View view){
        Intent i = new Intent(this, tercero_lenguaje_ab.class);
        startActivity(i);
    }
    public void to_tercero_lenguaje_cd (View view){
        Intent i = new Intent(this, tercero_lenguaje_cd.class);
        startActivity(i);
    }
    public void to_tercero_matematicas (View view){
        Intent i = new Intent(this, tercero_matematicas.class);
        startActivity(i);
    }
}

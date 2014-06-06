package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;

public class sexto_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexto_materias);
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
    public void to_sexto_english_air1 (View view) {
        Intent i = new Intent(this, sexto_english_air1.class);
        startActivity(i);
    }
    public void to_sexto_english_air2 (View view){
        Intent i = new Intent(this, sexto_english_air2.class);
    startActivity(i);
    }
    public void to_sexto_english_water (View view){
        Intent i = new Intent(this, sexto_english_water.class);
        startActivity(i);
    }
    public void to_sexto_es_sociales (View view){
        Intent i = new Intent(this, sexto_es_sociales.class);
        startActivity(i);
    }
    public void to_sexto_lenguaje (View view){
        Intent i = new Intent(this, sexto_lenguaje.class);
        startActivity(i);
    }
    public void to_sexto_matematicas_sl (View view){
        Intent i = new Intent(this, sexto_matematicas_sl.class);
        startActivity(i);
    }
    public void to_sexto_matematicas_higher1 (View view){
        Intent i = new Intent(this, sexto_matematicas_higher1.class);
        startActivity(i);
    }
    public void to_sexto_matematicas_higher2 (View view){
        Intent i = new Intent(this, sexto_matematicas_higher2.class);
        startActivity(i);
    }
    public void to_sexto_science_ad (View view){
        Intent i = new Intent(this, sexto_science_ad.class);
        startActivity(i);
    }
    public void to_sexto_science_bc (View view){
        Intent i = new Intent(this, sexto_science_bc.class);
        startActivity(i);
    }
}

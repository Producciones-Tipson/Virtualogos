package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;

public class octavo_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octavo_materias);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        getActionBar().setTitle("Materias");
        getSupportActionBar().setTitle("Materias");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.octavo_materias, menu);
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
    public void to_octavo_es_sociales (View view){
        Intent i = new Intent(this, octavo_es_sociales.class);
        startActivity(i);
    }
    public void to_octavo_science (View view){
        Intent i = new Intent(this, octavo_science.class);
        startActivity(i);
    }
    public void to_octavo_english_sl (View view){
        Intent i = new Intent(this, octavo_english_sl.class);
        startActivity(i);
    }
    public void to_octavo_english_higher (View view){
        Intent i = new Intent(this, octavo_english_higher.class);
        startActivity(i);
    }
    public void to_octavo_matematicas_sl (View view){
        Intent i = new Intent(this, octavo_matematicas_sl.class);
        startActivity(i);
    }
    public void to_octavo_matematicas_higher (View view){
        Intent i = new Intent(this, octavo_matematicas_higher.class);
        startActivity(i);
    }
    public void to_octavo_lenguaje (View view){
        Intent i = new Intent(this, octavo_lenguaje.class);
        startActivity(i);
    }
    public void to_octavo_social_studies (View view){
        Intent i = new Intent(this, octavo_social_studies.class);
        startActivity(i);
    }
}

package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;

public class noveno_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noveno_materias);
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
    public void to_noveno_es_sociales (View view){
        Intent i = new Intent(this, noveno_es_sociales.class);
        startActivity(i);
    }
    public void to_noveno_lenguaje (View view){
        Intent i = new Intent(this, noveno_lenguaje.class);
        startActivity(i);
    }
    public void to_noveno_english_sl (View view){
        Intent i = new Intent(this, noveno_english_sl.class);
        startActivity(i);
    }
    public void to_noveno_english_higher (View view){
        Intent i = new Intent(this, noveno_english_higher.class);
        startActivity(i);
    }
    public void to_noveno_matematicas_sl (View view){
        Intent i = new Intent(this, noveno_matematicas_sl.class);
        startActivity(i);
    }
    public void to_noveno_matematicas_higher (View view){
        Intent i = new Intent(this, noveno_matematicas_higher.class);
        startActivity(i);
    }
    public void to_noveno_science (View view){
        Intent i = new Intent(this, noveno_science.class);
        startActivity(i);
    }
    public void to_noveno_social_studies (View view){
        Intent i = new Intent(this, noveno_social_studies.class);
        startActivity(i);
    }
}

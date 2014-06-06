package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Vector;


public class decimo_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimo_materias);
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
    public void to_decimo_english_higher1 (View view){
        Intent i = new Intent(this, decimo_english_higher1.class);
        startActivity(i);
    }
    public void to_decimo_english_higher2 (View view){
        Intent i = new Intent(this, decimo_english_higher2.class);
        startActivity(i);
    }
    public void to_decimo_english_sl (View view){
        Intent i = new Intent(this, decimo_english_sl.class);
        startActivity(i);
    }
    public void to_decimo_lenguaje_a (View view ){
        Intent i = new Intent(this, decimo_lenguajea.class);
        startActivity(i);
    }
    public void to_decimo_lenguaje_bc (View view){
        Intent i = new Intent(this, decimo_lenguajebc.class);
        startActivity(i);
    }
    public void to_decimo_es_sociales (View view){
        Intent i = new Intent(this, decimo_es_sociales.class);
        startActivity(i);
    }
    public void to_decimo_matematicas_higher1 (View view){
        Intent i = new Intent(this, decimo_matematicas_higher1.class);
        startActivity(i);
    }
    public void to_decimo_matematicas_higher2 (View view){
        Intent i = new Intent(this, decimo_matematicas_higher2.class);
        startActivity(i);
    }
    public void to_decimo_matematicas_sl (View view){
        Intent i = new Intent(this, decimo_matematicas_sl.class);
        startActivity(i);
    }
    public void to_decimo_social_studiesa (View view){
        Intent i = new Intent(this, decimo_social_studiesa.class);
        startActivity(i);
    }
    public void to_decimo_social_studiesb (View view){
        Intent i = new Intent(this, decimo_social_studiesb.class);
        startActivity(i);
    }
    public void to_decimo_social_studiesc (View view){
        Intent i = new Intent(this, decimo_social_studiesc.class);
        startActivity(i);
    }
}

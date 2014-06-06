package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.produccionestipson.virtualogos.app.R;
import com.produccionestipson.virtualogos.app.segundo_english_ab;
import com.produccionestipson.virtualogos.app.segundo_english_cd;
import com.produccionestipson.virtualogos.app.segundo_environment;
import com.produccionestipson.virtualogos.app.segundo_espanol_a;

public class segundo_materias extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_materias);
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
    public void to_segundo_english_ab (View view){
        Intent i = new Intent(this, segundo_english_ab.class);
        startActivity(i);
    }
    public void to_segundo_english_cd (View view){
        Intent i = new Intent(this, segundo_english_cd.class);
        startActivity(i);
    }
    public void to_segundo_environment (View view){
        Intent i =new Intent(this, segundo_environment.class);
        startActivity(i);
    }
    public void to_segundo_espanol_a (View view){
        Intent i = new Intent(this, segundo_espanol_a.class);
        startActivity(i);
    }
    public void to_segundo_espanol_b (View view){
        Intent i = new Intent(this, segundo_espanol_b.class);
        startActivity(i);
    }
    public void to_segundo_espanol_c (View view){
        Intent i = new Intent(this, segundo_espanol_c.class);
        startActivity(i);
    }
    public void to_segundo_espanol_d (View view){
        Intent i = new Intent(this, segundo_espanol_d.class);
        startActivity(i);
    }

}

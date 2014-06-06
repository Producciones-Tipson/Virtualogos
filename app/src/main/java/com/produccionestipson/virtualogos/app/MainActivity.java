package com.produccionestipson.virtualogos.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
    // esto son las conexiones de los botones con el resto de las pantallas

    //boton para segundo de basica
    public void to_segundo (View view){
        Intent i = new Intent(this, segundo_materias.class);
        startActivity(i);
    }
    //boton para tercero de basica
    public void to_tercero (View view){
        Intent i = new Intent(this, tercero_materias.class);
        startActivity(i);
    }
    //boton para cuarto de basica
    public void to_cuarto (View view){
        Intent i = new Intent(this, cuarto_materias.class);
        startActivity(i);
    }
    //boton para quinto de basica
    public void to_quinto (View view){
        Intent i = new Intent(this, quinto_materias.class);
        startActivity(i);
    }
    //boton para sexto de basica
    public void to_sexto (View view){
        Intent i = new Intent(this, sexto_materias.class);
        startActivity(i);
    }
    //boton para septimo de basica
    public void to_septimo (View view){
        Intent i = new Intent(this, septimo_materias.class);
        startActivity(i);
    }
    //boton para octavo de basica
    public void to_octavo (View view){
        Intent i = new Intent(this, octavo_materias.class);
        startActivity(i);
    }
    //boton para noveno de basica
    public void to_noveno (View view){
        Intent i = new Intent(this, noveno_materias.class);
        startActivity(i);
    }
    //boton para decimo de basica
    public void to_decimo (View view){
        Intent i = new Intent(this, decimo_materias.class);
        startActivity(i);
    }
    //boton para primero de bachillerato
    public void to_1bach (View view){
        Intent i = new Intent(this, primero_bach_materias.class);
        startActivity(i);
    }
    //boton para segundo de bachillerato
    public void to_2bach (View view){
        Intent i = new Intent(this, segundo_bach_materias.class);
        startActivity(i);
    }
    //boton para tercero de bachillerato
    public void to_3bach (View view){
        Intent i = new Intent(this, tercero_bach_materias.class);
        startActivity(i);
    }
}


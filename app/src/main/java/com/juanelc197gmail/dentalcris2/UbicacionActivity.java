package com.juanelc197gmail.dentalcris2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.ImageButton;

public class UbicacionActivity extends AppCompatActivity {

    //private Button btn1;
    private ImageButton imgb;

    private AdapterViewFlipper AVF;

    int[] images = {R.drawable.capturauno, R.drawable.capturados, R.drawable.capturatres, R.drawable.capturacuatro, R.drawable.capturacinco, R.drawable.capturaseix, R.drawable.capturasiete};
    String[] names = {"","","","","","",""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     if (getSupportActionBar()!=null) {

         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setDisplayShowHomeEnabled(true);
     }


        //boton de regresar
       /* btn1 = (Button) findViewById(R.id.btn_r);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent btn1 = new Intent (UbicacionActivity.this, InicioActivity.class);
                startActivity(btn1);
            }
        }); */

        imgb = (ImageButton) findViewById(R.id.img_btn);

        imgb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent imgb = new Intent (UbicacionActivity.this, MapsActivity.class);
                startActivity(imgb);
            }
        });



       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        AVF=(AdapterViewFlipper)findViewById(R.id.AVF);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), names, images);
        AVF.setAdapter(customAdapter);
        AVF.setFlipInterval(4000);
        AVF.setAutoStart(true);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}

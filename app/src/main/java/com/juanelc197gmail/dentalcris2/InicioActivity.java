package com.juanelc197gmail.dentalcris2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterViewFlipper;

public class InicioActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private AdapterViewFlipper AVF;

    int[] images = {R.drawable.capturauno, R.drawable.capturados, R.drawable.capturatres, R.drawable.capturacuatro, R.drawable.capturacinco, R.drawable.capturaseix, R.drawable.capturasiete};
    String[] names = {"","","","","","",""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        AVF=(AdapterViewFlipper)findViewById(R.id.AVF);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), names, images);
        AVF.setAdapter(customAdapter);
        AVF.setFlipInterval(4000);
        AVF.setAutoStart(true);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /* Espasio asignado para agregar el menu el codigo esta en una carpeta llamada chidorilingo */



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        boolean FragmentTransaction = false;
        android.support.v4.app.Fragment fragment = null;

        //FragmentManager fragmentManager = getSupportFragmentManager();


        if (id == R.id.nav_ubicacion) {
            // Handle the camera action

            Intent i = new Intent(this, UbicacionActivity.class);
            startActivity(i);



        } else if (id == R.id.nav_agendar) {


            Intent i = new Intent(this, AgendarActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_cancelar) {


            Intent i = new Intent(this, CancelarActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_promociones) {

            Intent i = new Intent(this, PromocionesActivity.class);
            startActivity(i);


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

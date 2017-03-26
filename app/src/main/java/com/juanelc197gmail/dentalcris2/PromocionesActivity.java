package com.juanelc197gmail.dentalcris2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

public class PromocionesActivity extends AppCompatActivity {

    WebView wv;

    //private ImageButton imbtn;

    public void onBackPressed() {
        if (wv.canGoBack()) {
            wv.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        wv = (WebView) findViewById(R.id.webv);

        //Habilitar JavaScrip
        wv.getSettings() .setJavaScriptEnabled(true);
        wv.setFocusable(true);
        wv.setFocusableInTouchMode(true);

        // Establezca la prioridad de render a alta
        wv.getSettings() .setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv.getSettings() .setCacheMode(WebSettings.LOAD_NO_CACHE);
        wv.getSettings() .setDomStorageEnabled(true);
        wv.getSettings() .setDatabaseEnabled(true);
        wv.getSettings() .setAppCacheEnabled(true);
        wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        //Cargar link
        wv.loadUrl("https://www.facebook.com/criisty.loopezz.3?ref=ts&fref=ts");
        wv.setWebViewClient(new WebViewClient());

        //imbtn = (ImageButton) findViewById(R.id.img_btn);

       /* imbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent imbtn = new Intent (PromocionesActivity.this, InicioActivity.class);
                startActivity(imbtn);
            }
        }); */

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}

package com.produccionestipson.virtualogos.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class septimo_matematicas_higher1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_septimo_matematicas_higher1);
        WebView webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webView.loadUrl("http://virtualogos.net/evalogos/course/view.php?id=53");
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webView.setWebViewClient(new WebViewClient());
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
        CookieManager.getInstance();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getActionBar().setTitle("Matematicas Higher level 1");
        getSupportActionBar().setTitle("Matemáticas Higher level 1");
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
}

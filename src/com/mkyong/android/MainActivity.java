package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {
        
        private WebView        webView;
        
        private LayoutInflater inflater;
        
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.webview);
                
                webView = (WebView) findViewById(R.id.webView1);

                JavaScriptInterface jsInterface = new JavaScriptInterface(this);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.addJavascriptInterface(jsInterface, "JSInterface");
                
                webView.getSettings().setAllowFileAccess(true);
                
                //webView.loadUrl("http://www.google.com");
                webView.loadUrl("file:///android_asset/index.html");
                
                createInflatorForMenuButtons();
        }
        
        private void createInflatorForMenuButtons() {
                inflater = LayoutInflater.from(getBaseContext());
                View viewControl = inflater.inflate(R.layout.geomap_control, null);
                LayoutParams layoutParamsControl = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
                this.addContentView(viewControl, layoutParamsControl);
                
                ImageButton btn_geomap_logout = (ImageButton) findViewById(R.id.btn_geomap_logout);
                btn_geomap_logout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {}
                });
                
                ImageButton btn_geomap_open_form = (ImageButton) findViewById(R.id.btn_geomap_open_form);
                btn_geomap_open_form.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {}
                });
                
                ImageButton btn_geomap_open_settings = (ImageButton) findViewById(R.id.btn_geomap_open_settings);
                btn_geomap_open_settings.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {}
                });
        }
        
}
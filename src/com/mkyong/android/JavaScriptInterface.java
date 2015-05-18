package com.mkyong.android;

import android.app.Activity;
import android.util.Log;

public class JavaScriptInterface {
        
        private Activity activity;
        
        public JavaScriptInterface(Activity activiy) {
                this.activity = activiy;
        }
        
        public void logMessage(String message) {
                Log.e("Recebido do HTML:", message);
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setDataAndType(Uri.parse(videoAddress), "video/3gpp");
                //activity.startActivity(intent);
        }
}
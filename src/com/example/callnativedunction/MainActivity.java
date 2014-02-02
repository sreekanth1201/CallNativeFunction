package com.example.callnativedunction;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
public class MainActivity extends DroidGap {
	public NativeClass nc;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.init();
        nc = new NativeClass(this, appView);
        appView.addJavascriptInterface(nc, "testClass");
        super.loadUrl("file:///android_asset/www/index.html");
    }


   
    
}

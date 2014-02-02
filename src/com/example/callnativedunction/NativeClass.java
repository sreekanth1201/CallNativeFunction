package com.example.callnativedunction;

import org.apache.cordova.DroidGap;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class NativeClass {
	private WebView mAppView;
    private DroidGap mGap;
    public NativeClass(DroidGap gap, WebView view)
    {
    	mAppView = view;
    	mGap = gap;
    }
    @JavascriptInterface
    public void callNative(){     
    	   Intent intent = new Intent(mGap, SampleActivity.class);
           mGap.startActivity(intent);
    }
    
 
}

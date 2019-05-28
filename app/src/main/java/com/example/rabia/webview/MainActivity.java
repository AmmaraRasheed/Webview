package com.example.rabia.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        WebView myWebView = (WebView) findViewById(R.id.webview);
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        myWebView.loadUrl("file:///android_asset/webview.html");
//        myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");



//         Create an unencoded HTML string
// then convert the unencoded HTML string into bytes, encode
// it with Base64, and load the data.
//        String unencodedHtml =
//                "<!DOCTYPE html>\n" +
//                        "<html>\n" +
//                        "<head>\n" +
//                        "\t<title></title>\n" +
//                        "</head>\n" +
//                        "<body>\n" +
//                        "\t<h1>Ammara Rasheed</h1>\n" +
//                        "</body>\n" +
//                        "</html>";
//        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(),
//                Base64.NO_PADDING);
//        myWebView.loadData(encodedHtml, "text/html", "base64");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
            myWebView.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }
    public  void page1(View view){
        myWebView.loadUrl("https://developer.android.com/guide/webapps/webview");
    }
    public  void page2(View view){
        myWebView.loadUrl("https://www.google.com/");
    }
}


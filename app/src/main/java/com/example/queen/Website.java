package com.example.queen;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Website  extends AppCompatActivity {

    WebView website;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.website);

        website=findViewById(R.id.website);
        website.setWebViewClient(new WebViewClient());//this will render the website on app
        website.loadUrl("http://www.queenonline.com");
    }

    //when i click back button ill be tranfer to my previous page in webview remove this function n see the diffrence
    @Override
    public void onBackPressed() {
        if (website.canGoBack()) {
            website.goBack();
        } else {
            super.onBackPressed();
        }
    }




}


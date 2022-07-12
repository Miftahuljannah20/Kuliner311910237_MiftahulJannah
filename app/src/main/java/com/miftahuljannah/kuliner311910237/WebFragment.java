package com.miftahuljannah.kuliner311910237;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class WebFragment extends Fragment {
    private Button btnCall;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_web, container, false);
        WebView myWebView = myView.findViewById(R.id.web_view);

        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.kulineran.com");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

//        btnCall = btnCall.findViewById(R.id.btn_call);
//
//        final String telepon = "tel:085896654071";
//
//        btnCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse(telepon));
//                startActivity(call);
//            }
//        });

        // Inflate the layout for this fragment
         return myView;

    }

}

package com.kiki.kikinews.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.kiki.kikinews.R;

import java.net.URL;

public class WebViewActivity extends AppCompatActivity {

    public static final String URL="url";
    private WebView webView;
    private NumberProgressBar numberProgressBar;
    String url;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent=getIntent();
        url=intent.getStringExtra(URL);
        initView();
        initData();
    }

    public static void newInstance(Context context, String url) {
        Intent intent=new Intent(context,WebViewActivity.class);
        intent.putExtra(URL,url);
        context.startActivity(intent);
    }

    private void initView() {
        setContentView(R.layout.activity_web_view);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbat_webV);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(android.R.drawable.ic_media_previous);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        webView=(WebView) findViewById(R.id.web_view);
        numberProgressBar=(NumberProgressBar) findViewById(R.id.numberpb);
    }

    private void initData() {
        WebSettings webSettings=webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAppCacheEnabled(true);
        webView.setWebChromeClient(new ChromeCLient());
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                loadUrl(url);
                return true;
            }
        });
        if(!TextUtils.isEmpty(url)){
            loadUrl(url);
        }
        webView.setDownloadListener(new MyDownloadListener());
    }

    private void loadUrl(String url) {
        if(webView!=null){
            webView.loadUrl(url);
        }
    }


    private class ChromeCLient extends WebChromeClient {
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);

            numberProgressBar.setProgress(newProgress);
            if(newProgress==100){
                numberProgressBar.setVisibility(View.GONE);
            }else{
                numberProgressBar.setVisibility(View.VISIBLE);
            }
        }
    }

    private class MyDownloadListener implements DownloadListener {
        @Override
        public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
            Uri uri=Uri.parse(url);
            Intent intent=new Intent(Intent.ACTION_VIEW,uri);
            startActivity(intent);
        }
    }

    public boolean onKeyDown(int keyCode,KeyEvent event){
        if((keyCode==KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return  super.onKeyDown(keyCode,event);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(webView!=null){
            webView.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(webView!=null){
            webView.destroy();
        }
    }

    @Override
    protected void onPause() {
        if (webView!=null){
            webView.onPause();
        }
        super.onPause();
    }
}

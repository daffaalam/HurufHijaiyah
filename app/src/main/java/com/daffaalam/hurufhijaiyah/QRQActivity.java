package com.daffaalam.hurufhijaiyah;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class QRQActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrq);

        ImageView qrq1_vid = findViewById(R.id.qrq1_vid);
        ImageView qrq2_vid = findViewById(R.id.qrq2_vid);
        qrq1_vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/owzsmAVsX-g")));
            }
        });
        qrq2_vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/hvyC8UNf-Mg")));
            }
        });

        WebView prinsip_qrq = findViewById(R.id.prinsip_qrq);
        prinsip_qrq.setBackgroundColor(Color.TRANSPARENT);
        prinsip_qrq.loadUrl("file:///android_asset/prinsip_qrq");
    }
}

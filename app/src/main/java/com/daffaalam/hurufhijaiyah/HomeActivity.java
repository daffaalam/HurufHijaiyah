package com.daffaalam.hurufhijaiyah;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle(R.string.app_name);

        TextView textView1 = findViewById(R.id.text_home_1);
        TextView textView2 = findViewById(R.id.text_home_2);
        textView1.setTypeface(Typeface.createFromAsset(getAssets(), "arab.ttf"));
        textView1.setText(R.string.home_1);
        textView2.setText(R.string.home_2);

        TextView versi = findViewById(R.id.ver);
        TextView about = findViewById(R.id.about);
        versi.setText("App version : " + BuildConfig.VERSION_NAME);
        about.setPaintFlags(about.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, AboutActivity.class));
            }
        });
    }

    public void hijaiyah(View view) {
        startActivity(new Intent(HomeActivity.this, HijaiyahActivity.class));
    }

    public void qrq(View view) {
        startActivity(new Intent(HomeActivity.this, QRQActivity.class));
    }

    public void sambung(View view) {
        startActivity(new Intent(HomeActivity.this, HijaiyahSambungActivity.class));
    }
}

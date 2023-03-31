package com.logikaqu.tv_latihan_01;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ListFragment;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    TextView txtJudul;
    TextView txtSubtitle;
    TextView txtDeskripsi;
    ImageView imgBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBanner = findViewById(R.id.img_banner);
        txtJudul = findViewById(R.id.judul);
        txtSubtitle = findViewById(R.id.subtitle);
        txtDeskripsi = findViewById(R.id.deskripsi);

        getSupportFragmentManager().beginTransaction().add(R.id.list_fragment, new com.logikaqu.tv_latihan_01.ListFragment()).commit();
        //FragmentManager fm = getSupportFragmentManager();
        //fm.beginTransaction().add(R.id.list_fragment, new ListFragment()).commit();
    }
}
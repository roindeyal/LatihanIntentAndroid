package com.svafvel.software.production.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {

    // Membuat variabel Default EXTRA ( Wajib )
    public static final String EXTRA_NAME = "Extra Nama";
    public static final String EXTRA_AGE = "Extra Age";
    public static final String EXTRA_EMAIL = "Extra Email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        // Mengambil dan menyimpan TextView dengan id tv_data_received
        // Ke dalam variabel tvDataReceived
        TextView tvDataReceived = findViewById(R.id.tv_data_received);

        // Mengambil Nilai dari Variabel Extra Dari Activity Lain dengan Intent
        String name = getIntent().getStringExtra(EXTRA_NAME);

        // Untuk Variabel Extra Int Perlu Nilai Default
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);

        // Menggabungkan Text dan Menyimpan ke dalam text
        String text = "Haii... Nama Saya Adalah " + name + "\nUmur Saya " + age
                + "\nEmail Saya " + email;

        // Mengsetting TextView tvDataReceived
        tvDataReceived.setText(text);


    }
}

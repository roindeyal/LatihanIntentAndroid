package com.svafvel.software.production.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// Untuk menghubungkan btn dengan event harus mengimplementasikan View.OnClickListener
public class MoveActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        // Membuat variabel btnToast dengan Tipe data Button dan langsung Menyimpan
        // Button Toast yang ada di Layout Activity_Move.xml
        Button btnToast = findViewById(R.id.btn_toast);

        // Menghubungkan Button dengan Event OnClickLitener
        btnToast.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        // Membuat Perkondisian dengan Switch
        // dan menjadi v sebagai syaratnya
        switch (v.getId()){

            // Jika btn yang klik itu btn dengan id btn_toast
            case R.id.btn_toast:
                // Maka akan mengeluarkan Toast dibawah ini
                Toast.makeText(getApplicationContext(), "Anda Berada di Move Activity", Toast.LENGTH_SHORT).show();


        }

    }
}

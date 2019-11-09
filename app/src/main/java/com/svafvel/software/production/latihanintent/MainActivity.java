package com.svafvel.software.production.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivityWithData = findViewById(R.id.btn_move_activity_data);
        btnMoveActivityWithData.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_move_activity :
                // Baris kode dibawah berfungsi untuk pindah dari activity 1 ke activity yang lain
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);
                break;

            case R.id.btn_move_activity_data :

                // Baris kode dibawah berfungsi untuk pindah dari activity 1 ke activity yang lain
                Intent moveActivityWithData = new Intent(MainActivity.this, MoveWithDataActivity.class);

                // putExtra untuk mengirimkan data bersamaan dengan obyek Intent
                // Sedangkan metode putExtra() itu sendiri merupakan metode yang menampung
                // Pasangan key-value dan memiliki pilihan tipe input
                moveActivityWithData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Andika Kurniawan");
                moveActivityWithData.putExtra(MoveWithDataActivity.EXTRA_AGE, 19);
                moveActivityWithData.putExtra(MoveWithDataActivity.EXTRA_EMAIL,"AndikaKurnwn@roindeyal.com");

                // Memulai Activity yang Baru
                startActivity(moveActivityWithData);
                break;

        }



    }

}

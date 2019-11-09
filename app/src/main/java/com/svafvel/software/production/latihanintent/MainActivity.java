package com.svafvel.software.production.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        Button btnMoveActivityWithObject = findViewById(R.id.btn_move_acitivity_objek);
        btnMoveActivityWithObject.setOnClickListener(this);

        Button btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_move_activity :
                // Baris kode dibawah berfungsi untuk pindah dari activity 1 ke activity yang lain
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);

                // Memulai Activity yang Baru
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


            case R.id.btn_move_acitivity_objek :

                // Atur data obyek person sesuai dengan propertinya kemudian akan mengirimkan
                // Data tersebut ke MoveWithObjectActivity
                Person person = new Person();
                person.setName("Andika Kurniawan");
                person.setAge(19);
                person.setEmail("Andikakurnwn@roindeya.com");
                person.setCity("Bekasi");



                // Baris kode dibawah berfungsi untuk pindah dari activity 1 ke activity yang lain
                Intent moveActivityWithObject = new Intent(MainActivity.this, MoveWithObjectActivity.class);

                // Mengirimkannya Melalui baris kode dibawah ini
                moveActivityWithObject.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);
                startActivity(moveActivityWithObject);
                break;

            case R.id.btn_dial_number :

                String phoneNumber = "081574083369";

                
                Intent dialNumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialNumber);

                break;

        }



    }

}

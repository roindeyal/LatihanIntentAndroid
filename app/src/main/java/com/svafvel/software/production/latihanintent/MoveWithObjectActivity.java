package com.svafvel.software.production.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MoveWithObjectActivity extends AppCompatActivity {

    public static final String EXTRA_PERSON = "extra person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        TextView tvObjectReceived = findViewById(R.id.tv_object_received);

        // Mengbuat variabel dan Menyimpan data dari EXTRA_PERSON
        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + person.getName() + ", \nEmail : " + person.getEmail() +
                ", \nAge : " + person.getAge() + ", \n" + person.getCity();

        tvObjectReceived.setText(text);



    }
}

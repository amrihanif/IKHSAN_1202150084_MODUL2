package com.example.ikhsanlaisa.ikhsan_1202150084_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView lsplash = findViewById(R.id.splash);

        //untuk menjadwalkan pesan atau runnable untuk diksekusi
        final Handler handler = new Handler();
        //Runnable merupakan bagian yang akan di eksekusi dan SPALASH TIME merupakan lama penundaan sampai Runnable akan dieksekusi
        handler.postDelayed(new Runnable() {
            //merupakan method yang otomatis muncul ketika menggunakan Runnable()
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L);
    }
}

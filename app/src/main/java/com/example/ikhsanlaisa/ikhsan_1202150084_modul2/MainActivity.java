package com.example.ikhsanlaisa.ikhsan_1202150084_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private RadioButton mRb1, mRb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadioGroup = findViewById(R.id.rg);
        Toast.makeText(this, "Muhamad Ikhsan Laisa 1202150084", Toast.LENGTH_LONG).show();
    }

    public void pesanSekarang(View view) {
        //mendefinisikan radion button group jika di cek makan valuenya akan disimpan dalam sebuah variabel
        int selectedId = mRadioGroup.getCheckedRadioButtonId();
        mRb1 = findViewById(R.id.rb1);
        mRb2 = findViewById(R.id.rb2);

        //mengecek apakah value yang terpilih sesuai dengan nilai radio groupnya kalau benar maka akan pindah tampilan
        if (selectedId == mRb1.getId()){
            Intent intent = new Intent(MainActivity.this, dineIn.class);
            startActivity(intent);
        }else {
            Intent intent = new Intent(MainActivity.this, takeAway.class);
            startActivity(intent);
        }
    }
}

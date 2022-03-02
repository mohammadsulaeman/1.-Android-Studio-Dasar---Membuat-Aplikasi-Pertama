package com.example.aplikasipertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNama;
    private TextView textNama;
    private Button btnKirim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // melakukan inisialisai pada widget dengan memangil id pada setiap widget
        edtNama = findViewById(R.id.edit_nama_anda);
        textNama = findViewById(R.id.text_hasil_nama);
        btnKirim = findViewById(R.id.btn_kirim_nama);

        // melakukan proses action pada widget button jika di lakukan proses klik menghasilkan nama yang di input
        btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                //menampilkan inputan pada widget edit text
                String nama = edtNama.getText().toString();

                //menampilkan hasil inputan dari widget edit text ke widget textview
                textNama.setText("Hallo Nama Saya : " + nama);
                edtNama.getText().clear();
            }
        });
    }
}
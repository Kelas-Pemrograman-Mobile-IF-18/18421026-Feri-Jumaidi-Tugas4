package com.feri.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Halaman2 extends AppCompatActivity {

    @BindView(R.id.txtNama)
    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        ButterKnife.bind(this);

        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        txtNama.setText(nama);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.btnKembali)
    void pindah(){
        Intent i = new Intent(Halaman2.this, Halaman1.class);
        startActivity(i);
        finish();
    }
  }
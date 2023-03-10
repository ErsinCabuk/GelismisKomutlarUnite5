package com.example.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ec.ersincabuk.gelismiskomutlarunite5.GoldSoru1_DortIslem;

public class GoldSoru1Activity extends AppCompatActivity {
    Button bir, iki, uc, dort, bes, alti, yedi, sekiz, dokuz, sifir, arti, eksi, carpi, bolu, esittir, sil;
    TextView txtViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru1_activity);

        bir = findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        sifir = findViewById(R.id.sifir);
        arti = findViewById(R.id.arti);
        eksi = findViewById(R.id.eksi);
        carpi = findViewById(R.id.carpi);
        bolu = findViewById(R.id.bolu);
        esittir = findViewById(R.id.esittir);
        sil = findViewById(R.id.sil);
        txtViewSonuc = findViewById(R.id.txtViewSonuc);
    }

    public void yaz(View view) {
        Button btn = (Button) view;
        String buttonText = btn.getText().toString();
        String sonuc = txtViewSonuc.getText().toString();
        if(sonuc.substring(sonuc.length() - 1) == " ") txtViewSonuc.setText(sonuc.substring(0, sonuc.length() - 2) + buttonText + " ");
        if(buttonText == "+" || buttonText == "-" || buttonText == "*" || buttonText == "/") txtViewSonuc.setText(sonuc + " " + buttonText + " ");
        else txtViewSonuc.setText(sonuc + buttonText);
    }

    public void esittir(View view) {
        String sonucc = txtViewSonuc.getText().toString();
        String[] sonucDizisi = sonucc.split(" ");

        int sayi1 = Integer.parseInt(sonucDizisi[0]), sayi2 = Integer.parseInt(sonucDizisi[2]);
        String islem = sonucDizisi[1];

        GoldSoru1_DortIslem sonuc = new GoldSoru1_DortIslem(sayi1, sayi2, islem);

        txtViewSonuc.setText(sonucc + " = " + sonuc);
    }
}
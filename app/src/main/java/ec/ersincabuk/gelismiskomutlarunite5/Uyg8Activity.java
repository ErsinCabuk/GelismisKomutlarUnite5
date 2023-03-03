package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg8Activity extends AppCompatActivity {
    TextView txtViewBilgi;
    Uyg8_Araba araba = new Uyg8_Araba();
    Uyg8_Minibus minibus = new Uyg8_Minibus();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);

        txtViewBilgi = findViewById(R.id.txtViewBilgi);
        araba.setKapiSayisi(5);
        araba.setMaksimumHiz(210);

        minibus.setKapiSayisi(3);
        minibus.setMaksimumHiz(170);
    }

    public void btnArabaKapiSayisi(View view) {
        txtViewBilgi.setText(araba.kapiSayisiniGoster());
    }

    public void btnArabaMaksHizi(View view) {
        txtViewBilgi.setText(araba.maksimumHizGoster());
    }

    public void btnArabaCalistir(View view) {
        txtViewBilgi.setText(araba.calistir());
    }

    public void btnArabaIseGit(View view) {
        txtViewBilgi.setText(araba.iseGit());
    }

    public void btnMinibusKapiSayisi(View view) {
        txtViewBilgi.setText(minibus.kapiSayisiniGoster());
    }

    public void btnMinibusMaksHizi(View view) {
        txtViewBilgi.setText(minibus.maksimumHizGoster());
    }

    public void btnMinibusCalistir(View view) {
        txtViewBilgi.setText(minibus.calistir());
    }

    public void btnMinibusYolcuIndir(View view) {
        txtViewBilgi.setText(minibus.yolcuIndir());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

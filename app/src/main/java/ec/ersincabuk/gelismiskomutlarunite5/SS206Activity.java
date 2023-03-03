package ec.ersincabuk.gelismiskomutlarunite5;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class SS206Activity extends AppCompatActivity {
    TextView txtViewBilgi;
    public Asker asker = new Asker();
    public Tankci tankci = new Tankci();
    public Topcu topcu = new Topcu();
    String mesaj = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss206_activity);
        txtViewBilgi = findViewById(R.id.txtViewBilgi);
    }

    public void btnAsker(View view) {
        mesaj = asker.atesEt();
        txtViewBilgi.setText(mesaj);
    }

    public void btnTankci(View view) {
        mesaj = tankci.atesEt();
        txtViewBilgi.setText(mesaj);
    }

    public void btnTopcu(View view) {
        mesaj = topcu.atesEt();
        txtViewBilgi.setText(mesaj);
    }
}

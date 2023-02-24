package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg6Activity extends AppCompatActivity {
    EditText txtKisaKenar, txtUzunKenar;
    TextView txtViewAlan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);
        txtKisaKenar = findViewById(R.id.txtKisaKenar);
        txtUzunKenar = findViewById(R.id.txtUzunKenar);
        txtViewAlan = findViewById(R.id.txtViewAlan);
    }

    public void btnKareAlani(View view) {
        int kenar = Integer.parseInt(txtKisaKenar.getText().toString());
        Uyg6_Dortgen kare = new Uyg6_Dortgen(kenar);
        Integer alan = kare.alanBul();
        txtViewAlan.setText(alan.toString());
    }

    public void btnDikdortgenAlani(View view) {
        int kisaKenar = Integer.parseInt(txtKisaKenar.getText().toString());
        int uzunKenar = Integer.parseInt(txtUzunKenar.getText().toString());
        Uyg6_Dortgen dikdortgen = new Uyg6_Dortgen(kisaKenar, uzunKenar);
        Integer alan = dikdortgen.alanBul();
        txtViewAlan.setText(alan.toString());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

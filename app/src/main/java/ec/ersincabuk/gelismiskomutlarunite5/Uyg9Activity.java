package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtKenar;
    TextView txtViewCevre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        txtKenar = findViewById(R.id.txtKenar);
        txtViewCevre = findViewById(R.id.txtViewCevre);
    }

    public void btnUcgen(View view) {
        Integer uzunluk = Integer.parseInt(txtKenar.getText().toString());
        Uyg9_Ucgen ucgen = new Uyg9_Ucgen(uzunluk);
        Integer cevre = ucgen.cevre();
        txtViewCevre.setText(cevre.toString());
    }

    public void btnKare(View view) {
        Integer uzunluk = Integer.parseInt(txtKenar.getText().toString());
        Uyg9_Kare kare = new Uyg9_Kare(uzunluk);
        Integer cevre = kare.cevre();
        txtViewCevre.setText(cevre.toString());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

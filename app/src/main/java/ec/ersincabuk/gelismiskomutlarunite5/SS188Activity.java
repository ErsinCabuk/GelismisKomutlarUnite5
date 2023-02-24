package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class SS188Activity extends AppCompatActivity {
    EditText txtBirKenar, txtIkiKenar, txtUcKenar;
    TextView txtCevre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss188_activity);
        txtBirKenar = findViewById(R.id.txtBirKenar);
        txtIkiKenar = findViewById(R.id.txtIkiKenar);
        txtUcKenar = findViewById(R.id.txtUcKenar);
        txtCevre = findViewById(R.id.txtViewCevre);
    }

    public void btnEskenar(View view) {
        int birKenar = Integer.parseInt(txtBirKenar.getText().toString());
        SS188_Ucgen ucgen = new SS188_Ucgen(birKenar);
        Integer cevre = ucgen.cevreBul();
        txtCevre.setText(cevre.toString());
    }

    public void btnIkizkenar(View view) {
        int birKenar = Integer.parseInt(txtBirKenar.getText().toString());
        int ikiKenar = Integer.parseInt(txtIkiKenar.getText().toString());
        SS188_Ucgen ucgen = new SS188_Ucgen(birKenar, ikiKenar);
        Integer cevre = ucgen.cevreBul();
        txtCevre.setText(cevre.toString());
    }

    public void btnCesitkenar(View view) {
        int birKenar = Integer.parseInt(txtBirKenar.getText().toString());
        int ikiKenar = Integer.parseInt(txtIkiKenar.getText().toString());
        int ucKenar = Integer.parseInt(txtUcKenar.getText().toString());
        SS188_Ucgen ucgen = new SS188_Ucgen(birKenar, ikiKenar, ucKenar);
        Integer cevre = ucgen.cevreBul();
        txtCevre.setText(cevre.toString());
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(SS188Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
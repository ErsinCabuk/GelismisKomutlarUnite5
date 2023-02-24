package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg7Activity extends AppCompatActivity {
    EditText txtYas;
    TextView txtViewCevre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        txtYas = findViewById(R.id.txtYas);
        txtViewCevre = findViewById(R.id.txtViewSonuc);
    }

    public void btnKaydet(View view) {
        int yas = Integer.parseInt(txtYas.getText().toString());
        Uyg7_Personel personel = new Uyg7_Personel();
        personel.setYas(yas);
        txtViewCevre.setText(Integer.toString(personel.getYas()));
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg7Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

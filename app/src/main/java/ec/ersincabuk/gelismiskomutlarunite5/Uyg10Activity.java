package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg10Activity extends AppCompatActivity {
    TextView txtViewBilgi;
   // public Asker asker = new Asker();
    //public Tankci tankci = new Tankci();
    String mesaj = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        txtViewBilgi = findViewById(R.id.txtViewBilgi);
    }

    public void btnAsker(View view) {
        txtViewBilgi.setText(mesaj);
    }

    public void btnTankci(View view) {
        txtViewBilgi.setText(mesaj);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg10Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

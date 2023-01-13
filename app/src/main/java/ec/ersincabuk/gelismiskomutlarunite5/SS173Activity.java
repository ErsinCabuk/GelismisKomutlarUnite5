package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class SS173Activity extends AppCompatActivity {
    EditText textName, textSurname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss173_activity);
        textName = findViewById(R.id.textName);
        textSurname = findViewById(R.id.textSurname);
    }

    public void btnHello1(View view) {
        Toast.makeText(this, "Merhaba " + textName.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void btnHello2(View view) {
        Toast.makeText(this, "İyi Günler " + textName.getText().toString() + " " + textSurname.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(SS173Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}
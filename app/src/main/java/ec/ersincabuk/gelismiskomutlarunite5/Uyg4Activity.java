package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

public class Uyg4Activity extends AppCompatActivity {
    EditText textNumber1, textNumber2, textNumber3;
    TextView textResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);

        textNumber1 = findViewById(R.id.textNumber1);
        textNumber2 = findViewById(R.id.textNumber2);
        textNumber3 = findViewById(R.id.textNumber3);
        textResult = findViewById(R.id.textResult);
    }

    public void btnPlusTwo(View view) {
        int sayi1 = Integer.parseInt(textNumber1.getText().toString());
        int sayi2 = Integer.parseInt(textNumber2.getText().toString());
        textResult.setText("Sonuç: " + Integer.toString(topla(sayi1, sayi2)));
    }

    public void btnPlusThree(View view) {
        int sayi1 = Integer.parseInt(textNumber1.getText().toString());
        int sayi2 = Integer.parseInt(textNumber2.getText().toString());
        int sayi3 = Integer.parseInt(textNumber3.getText().toString());
        textResult.setText("Sonuç: " + Integer.toString(topla(sayi1, sayi2, sayi3)));
    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    private int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg4Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

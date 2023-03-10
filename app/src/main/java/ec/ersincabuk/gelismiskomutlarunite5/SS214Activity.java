package ec.ersincabuk.gelismiskomutlarunite5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.gelismiskomutlarunite5.R;

import java.util.ArrayList;

public class SS214Activity extends AppCompatActivity {
    EditText txtAd, txtNo;
    ListView listAdlar, listNolar;
    ArrayList<String> adlarListesi = new ArrayList<>();
    ArrayList<String> nolarListesi = new ArrayList<>();
    ArrayAdapter<String> adAdapter, noAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ss214_activity);
        txtAd = findViewById(R.id.txtAd);
        txtNo = findViewById(R.id.txtNo);
        listAdlar = findViewById(R.id.listAdlar);
        listNolar = findViewById(R.id.listNolar);

        adAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, adlarListesi);
        noAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nolarListesi);

        listAdlar.setAdapter(adAdapter);
        listNolar.setAdapter(noAdapter);
    }

    public void btnEkle(View view) {
        String ad = txtAd.getText().toString();
        adlarListesi.add(ad);
        adAdapter.notifyDataSetChanged();
        txtAd.getText().clear();

        String no = txtNo.getText().toString();
        nolarListesi.add(no);
        noAdapter.notifyDataSetChanged();
        txtNo.getText().clear();
    }
}
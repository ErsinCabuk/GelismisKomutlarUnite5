package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

import java.util.ArrayList;

public class Uyg12Activity extends AppCompatActivity {
    EditText txtIsim;
    ListView listIsimler;
    ArrayList<String> isimlerListesi = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg12_activity);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, isimlerListesi);
        txtIsim = findViewById(R.id.txtIsim);
        listIsimler = findViewById(R.id.listIsimler);
        listIsimler.setAdapter(adapter);

        listIsimler.setOnItemClickListener((adapterView, view, i, l) -> {
            isimlerListesi.remove(i);
            adapter.notifyDataSetChanged();
        });
    }

    public void btnEkle(View view) {
        String ad = txtIsim.getText().toString();
        isimlerListesi.add(ad);
        adapter.notifyDataSetChanged();
        txtIsim.getText().clear();
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg12Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

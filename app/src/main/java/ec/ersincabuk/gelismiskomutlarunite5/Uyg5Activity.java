package ec.ersincabuk.gelismiskomutlarunite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gelismiskomutlarunite5.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Uyg5Activity extends AppCompatActivity {
    EditText textDeviceName, textDevicePower, textDeviceDaily;
    TextView textResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);

        textDeviceName = findViewById(R.id.textDeviceName);
        textDevicePower = findViewById(R.id.textDevicePower);
        textDeviceDaily = findViewById(R.id.textDeviceDaily);
        textResult = findViewById(R.id.textResult);
    }

    public void btnSuccess(View view) {
        String deviceName = textDeviceName.getText().toString();
        double kw = Double.parseDouble(textDevicePower.getText().toString());
        int daily = Integer.parseInt(textDeviceDaily.getText().toString());

        Uyg5_ElektrikliCihaz device = new Uyg5_ElektrikliCihaz();
        device.deviceName = deviceName;
        device.devicePower = kw;
        device.deviceDaily = daily;
        NumberFormat formatter = new DecimalFormat("#0.00");
        String resultMonthly = formatter.format(device.monthlyUsage());
        String resultPrice = formatter.format(device.price());
        textResult.setText("Aylık Kullanılan KW: " + resultMonthly + " KW \nFatura: " + resultPrice + " TL");
    }

    public void btnBack(View view) {
        Intent uyg = new Intent(Uyg5Activity.this, MainActivity.class);
        startActivity(uyg);
    }
}

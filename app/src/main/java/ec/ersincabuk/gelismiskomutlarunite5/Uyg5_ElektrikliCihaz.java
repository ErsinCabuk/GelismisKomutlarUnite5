package ec.ersincabuk.gelismiskomutlarunite5;

import android.util.Log;

public class Uyg5_ElektrikliCihaz {
    public String deviceName;
    public double devicePower;
    public double deviceDaily;

    //Kilowatt yerine Watt'a çevirdim
    public double monthlyUsage() {
        double monthlyUsagedPower = (devicePower / 1000) * deviceDaily * 30;
        return monthlyUsagedPower;
    }

    public double price() {
        double doubleDevicePower = monthlyUsage();
        double result = 0;
        if(doubleDevicePower > 150) result = (150 * 1.37) + ((doubleDevicePower - 150) * 2.06);
        else result = doubleDevicePower * 1.37;
        return result;
    }
}

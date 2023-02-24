package ec.ersincabuk.gelismiskomutlarunite5;

import android.util.Log;

public class Uyg7_Personel {
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<18 || yas>55){
            Log.e("Kapsülleme", "Hatalı yaş");
            yas = 18;
        }
        this.yas = yas;
    }
}

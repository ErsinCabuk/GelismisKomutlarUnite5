package ec.ersincabuk.gelismiskomutlarunite5;

public class GoldSoru1_DortIslem {
    public int sonuc;

    public GoldSoru1_DortIslem(int sayi1, int sayi2, String islem) {
        if(islem == "+") this.sonuc = sayi1 + sayi2;
        else if(islem == "-") this.sonuc = sayi1 - sayi2;
        else if(islem == "*") this.sonuc = sayi1 * sayi2;
        else if(islem == "/") this.sonuc = sayi1 / sayi2;
    }
}

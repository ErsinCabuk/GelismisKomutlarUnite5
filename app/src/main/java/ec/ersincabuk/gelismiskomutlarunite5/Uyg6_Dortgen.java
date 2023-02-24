package ec.ersincabuk.gelismiskomutlarunite5;

public class Uyg6_Dortgen {
    public int kisaKenar;
    public int uzunKenar;
    public int alanBul(){
        return kisaKenar * uzunKenar;
    }

    public Uyg6_Dortgen(int kenar) {
        this.kisaKenar = kenar;
        this.uzunKenar = kenar;
    }

    public Uyg6_Dortgen(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
}
package ec.ersincabuk.gelismiskomutlarunite5;

public class SS188_Ucgen {
    public int birKenar;
    public int ikiKenar;
    public int ucKenar;
    public int cevreBul() {
        return birKenar + ikiKenar + ucKenar;
    }

    public SS188_Ucgen(int birKenar) { //Eşkenar
        this.birKenar = birKenar;
        this.ikiKenar = birKenar;
        this.ucKenar = birKenar;
    }

    public SS188_Ucgen(int birKenar, int ikiKenar) {//İkizkenar
        this.birKenar = birKenar;
        this.ikiKenar = ikiKenar;
        this.ucKenar = ikiKenar;
    }

    public SS188_Ucgen(int birKenar, int ikiKenar, int ucKenar) {//Ückenar
        this.birKenar = birKenar;
        this.ikiKenar = ikiKenar;
        this.ucKenar = ucKenar;
    }


}

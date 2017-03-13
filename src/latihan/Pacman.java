package latihan;

public class Pacman {

    protected int sisaLangkah = 0;
    protected int poin = 0;
    protected int x, y;

    public void sLangkah(int l) {
        sisaLangkah = l;
    }
    
    public int gLangkah(){
        return sisaLangkah;
    }
    
    public int gPoin(){
        return poin;
    }
}
package hu.petrik.bankiszolgaltatas;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz(int osszeg) {
        boolean sikeresKivetel = false;
        if (hitelKeret - osszeg + super.aktualisEgyenleg >= 0) {
            super.kivesz(osszeg);
            sikeresKivetel = true;
        }
        return sikeresKivetel;
    }
}

package hu.petrik.bankiszolgaltatas;

public abstract class Szamla extends BankiSzolgaltatas {
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }
    public void befizet(int osszeg){
        aktualisEgyenleg += osszeg;
    }
    public boolean kivesz(int osszeg){
        return false;
    }
}

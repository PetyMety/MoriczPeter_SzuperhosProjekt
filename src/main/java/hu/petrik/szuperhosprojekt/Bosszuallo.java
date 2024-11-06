package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos masikSzuperhos) {
        if (masikSzuperhos instanceof Bosszuallo) {
            Bosszuallo bosszuallo = (Bosszuallo) masikSzuperhos;
            return bosszuallo.vanEGyengesege && this.szuperero > bosszuallo.szuperero;
        } else if (masikSzuperhos instanceof Batman) {
            return this.szuperero > 2 * masikSzuperhos.mekkoraAzEreje();
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Szupererő: {0}; {1}",
                String.format("%.2f", szuperero),
                vanEGyengesege ? "van gyengesége" : "nincs gyengesége");
    }
}

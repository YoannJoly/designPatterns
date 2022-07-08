package facade.setup;

public class Projecteur {

    LecteurDVD lecteurDVD;

    public void marche() {
        System.out.println("Projecteur.marche()");
    }

    public void arret() {
        System.out.println("Projecteur.arret()");
    }

    public void modeTv() {
        System.out.println("Projecteur.ModeTv()");
    }

    public void modeGrandEcran() {
        System.out.println("Projecteur.modeGrandEcran()");
    }
}

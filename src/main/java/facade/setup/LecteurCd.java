package facade.setup;

public class LecteurCd {

    Amplificateur amplificateur;

    public void marche() {
        System.out.println("Lecteur CD en marche");
    }

    public void arret() {
        System.out.println("Lecteur CD en arret");
    }

    public void ejecter() {
        System.out.println("Lecteur CD ejecté");
    }

    public void pause() {
        System.out.println("Lecteur CD en pause");
    }

    public void reprendre() {
        System.out.println("Lecteur CD repris");
    }

    public void jouer() {
        System.out.println("Lecteur CD en joue");
    }

    public void stop() {
        System.out.println("Lecteur CD en stop");
    }
}

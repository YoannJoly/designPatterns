package facade.setup;

public class Tuner {

    Amplificateur amplificateur;

    public void marche() {
        System.out.println("Tuner.marche()");
    }

    public void arret() {
        System.out.println("Tuner.arret()");
    }

    public void setFrequence(double frequence) {
        System.out.println("Tuner.setFrequence(" + frequence + ")");
    }

    public void setAM() {
        System.out.println("Tuner.setAM()");
    }

    public void setFM() {
        System.out.println("Tuner.setFM()");
    }
}

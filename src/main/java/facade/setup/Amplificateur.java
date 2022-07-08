package facade.setup;

public class Amplificateur {
    Tuner tuner;
    LecteurDVD lecteurDVD;
    LecteurCd lecteurCd;

    public void marche() {
        System.out.println("Amplificateur on");
    }

    public void arret() {
        System.out.println("Amplificateur off");
    }

    public void setCD() {
        System.out.println("Amplificateur: CD");
    }

    public void setDVD() {
        System.out.println("Amplificateur: DVD");
    }

    public void setStereo() {
        System.out.println("Amplificateur: Stereo");
    }

    public void setSurroundSound() {
        System.out.println("Amplificateur: Surround Sound");
    }

    public void setVolume(int volume) {
        System.out.println("Amplificateur: Volume " + volume);
    }

    public void setTuner() {
        System.out.println("Amplificateur: Tuner");
    }
}
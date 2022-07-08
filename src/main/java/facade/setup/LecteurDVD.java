package facade.setup;

public class LecteurDVD {

    Amplificateur amplificateur;

    public void marche() {
        System.out.println("LecteurDVD.marche()");
    }

    public void arret() {
        System.out.println("LecteurDVD.arret()");
    }

    public void ejecter() {
        System.out.println("LecteurDVD.ejecter()");
    }

    public void pause() {
        System.out.println("LecteurDVD.pause()");
    }

    public void reprendre() {
        System.out.println("LecteurDVD.reprendre()");
    }

    public void jouer() {
        System.out.println("LecteurDVD.jouer()");
    }

    public void stop() {
        System.out.println("LecteurDVD.stop()");
    }

    public void setAudioSuround() {
        System.out.println("LecteurDVD.setAudioSuround()");
    }

    public void setAudioStereo() {
        System.out.println("LecteurDVD.setAudioStereo()");
    }
}

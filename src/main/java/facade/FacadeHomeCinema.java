package facade;

import facade.setup.*;

public class FacadeHomeCinema {

    Projecteur projecteur = new Projecteur();
    Ecran ecran = new Ecran();
    MachineAPopcorn machineAPopcorn = new MachineAPopcorn();
    Lumieres lumieres = new Lumieres();
    Amplificateur amplificateur = new Amplificateur();
    LecteurDVD lecteurDVD = new LecteurDVD();
    LecteurCd lecteurCD = new LecteurCd();
    Tuner tuner = new Tuner();

    public void regarderFilm() {
        projecteur.marche();
        ecran.afficher("Le film commence");
        machineAPopcorn.marche();
        lumieres.marche();
        projecteur.modeTv();
    }

    public void arretFilm() {
        projecteur.arret();
        machineAPopcorn.arret();
        lumieres.arret();
        ecran.eteindre();
    }

    public void ecouterCd() {
        lecteurCD.marche();
        lecteurCD.jouer();
    }

    public void arreterCD() {
        lecteurCD.arret();
        lecteurCD.ejecter();
    }

    public void ecouterRadio() {
        tuner.marche();
        tuner.setFrequence(87.5);
        tuner.setAM();
    }

    public void arreteradio() {
        tuner.arret();
    }
}

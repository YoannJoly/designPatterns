package tp_builder.components;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String nom;
    private int capacite;
    private List<Animal> animaux = new ArrayList<>();

    public Zone(final String nom, final int capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(final int capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(final List<Animal> animaux) {
        this.animaux = animaux;
    }

    @Override
    public String toString() {
        return "Zone{" + "nom='" + nom + '\'' + ", capacite=" + capacite + ", animaux=" + animaux + '}';
    }
}

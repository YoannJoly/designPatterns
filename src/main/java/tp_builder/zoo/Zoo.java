package tp_builder.zoo;

import tp_builder.components.Zone;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Zone> zones = new ArrayList<>();

    public Zoo(final String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(final List<Zone> zones) {
        this.zones = zones;
    }

    @Override
    public String toString() {
        return "Zoo{" + "nom='" + nom + '\'' + ", zones=" + zones + '}';
    }
}

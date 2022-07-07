package tp_builder.components;

public class Animal {

    private String nom;

    public Animal(final String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Animal{" + "nom='" + nom + '\'' + '}';
    }
}

package tp_factory_method.objets.type_objets;

public enum typeObjet {
    TELEPHONE_PORTABLE("Telephone portable"), TABLETTE("Tablette"), ENCEINTE_CONNECTE("Enceinte connectée");

    private String nom;

    typeObjet(final String nom) {
        this.nom = nom;
    }
}

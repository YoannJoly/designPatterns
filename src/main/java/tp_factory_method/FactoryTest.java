package tp_factory_method;

import tp_factory_method.factory.Factory;
import tp_factory_method.objets.ObjectConnecte;
import tp_factory_method.objets.type_objets.typeObjet;

public class FactoryTest {
    public static void main(String[] args) {
        ObjectConnecte objet = Factory.createObjectConnecte(typeObjet.ENCEINTE_CONNECTE);
        System.out.println(objet.getLimiteVolts());
        objet = Factory.createObjectConnecte(typeObjet.TELEPHONE_PORTABLE);
        System.out.println(objet.getLimiteVolts());
        objet = Factory.createObjectConnecte(typeObjet.TABLETTE);
        System.out.println(objet.getLimiteVolts());
    }

}

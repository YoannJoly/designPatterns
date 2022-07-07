package tp_factory_method.factory;

import tp_factory_method.objets.ObjectConnecte;
import tp_factory_method.objets.type_objets.EnceinteConnectee;
import tp_factory_method.objets.type_objets.Tablette;
import tp_factory_method.objets.type_objets.TelephonePortable;
import tp_factory_method.objets.type_objets.typeObjet;

public class Factory {
    public static ObjectConnecte createObjectConnecte(final typeObjet type) {
        return switch (type) {
            case TELEPHONE_PORTABLE -> new TelephonePortable(12);
            case TABLETTE -> new Tablette(24);
            case ENCEINTE_CONNECTE -> new EnceinteConnectee(5);
        };
    }


}

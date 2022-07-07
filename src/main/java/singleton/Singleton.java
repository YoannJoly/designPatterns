package singleton;

import java.util.ResourceBundle;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration");
        String valeur = configuration.getString("db.url");
        String valeur2 = configuration.getString("db.user");
        String valeur3 = configuration.getString("db.password");
        System.out.println("URL -> " + valeur + "\n" + "USER -> " + valeur2 + "\n" + "PASSWORD -> " + valeur3);
    }

    public static Singleton getInstance() {
        return instance;
    }
}


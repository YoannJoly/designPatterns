package tp_builder.builder;

import tp_builder.components.Animal;
import tp_builder.components.Zone;
import tp_builder.zoo.Zoo;

public class ZooBuilder {


    private final Zoo zoo;

    public ZooBuilder(String nom) {
        this.zoo = new Zoo(nom);
    }

    public void appendZone(final Zone zone) {
        zoo.getZones().add(zone);
    }

    public void appendAnimal(final Animal animal) {
        this.zoo.getZones().forEach(zone -> zone.getAnimaux().add(animal));
    }

   public void get() {
   }

    @Override
    public String toString() {
        return "ZooBuilder{" + "zoo=" + zoo + '}';
    }
}
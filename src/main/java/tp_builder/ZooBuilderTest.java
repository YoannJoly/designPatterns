package tp_builder;

import tp_builder.builder.ZooBuilder;
import tp_builder.components.Zone;
import tp_builder.components.animaux.Lion;

public class ZooBuilderTest {

    public static void main(String[] args) {
        ZooBuilder zoo = new ZooBuilder("Animalika");
        zoo.appendZone(new Zone("zone1", 10));
        zoo.appendAnimal(new Lion());
        zoo.get();
        System.out.println(zoo);
    }
}

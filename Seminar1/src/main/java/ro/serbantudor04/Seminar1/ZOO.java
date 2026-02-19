package ro.serbantudor04.Seminar1;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private ZooKeeper keeper;
    private List<Animal> animals;

    public ZOO(String name, ZooKeeper keeper) {
        this.name = name;
        this.keeper = keeper;
        this.animals = new ArrayList<>();
    }


    public ZOO addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

}

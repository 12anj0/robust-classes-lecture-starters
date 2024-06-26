package model;

import exceptions.BrokeException;
import exceptions.NotHungry;

import java.util.List;

public class Manager {

    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage() throws BrokeException {
        try {
            keeper.feed();
        } catch (NotHungry e) {
            e.printStackTrace();
            System.out.println("feed less often");
            throw new BrokeException();
        }
    }


}
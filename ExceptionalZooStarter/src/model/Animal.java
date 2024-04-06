package model;

import exceptions.NotHungry;

public class Animal {

    private boolean isHungry = true;
    private boolean hungry;
    private int eaten = 0;

    // getters
    public boolean isHungry() { return hungry; }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    // REQUIRES: animal must be hungry
    public int eat() throws NotHungry {
        //added
        if(!isHungry) throw new NotHungry();
        isHungry = false;
        eaten++;
        return eaten;
    }


}
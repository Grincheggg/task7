package eu.senla.task;

import java.util.Random;

public class FactoryOne implements Factory {

    @Override
    public <T> Enum robotConstruction() {
        int count = new Random().nextInt(RoboHead.values().length);
        return RoboHead.values()[count];
    }

}





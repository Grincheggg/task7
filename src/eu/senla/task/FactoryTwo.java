package eu.senla.task;

import java.util.Random;

public class FactoryTwo implements Factory{
       @Override
    public <T> Enum robotConstruction() {
        int count = new Random().nextInt(RoboBody.values().length);
        return RoboBody.values()[count];
    }
}

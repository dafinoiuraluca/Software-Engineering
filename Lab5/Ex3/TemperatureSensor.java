package Lab5.Ex3;

import java.util.Random;

import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor extends Sensor {
    public int readValue() {
        Random rand = new Random();

        double low = 0;
        double high = 100;
        double result = ThreadLocalRandom.current().nextDouble(low, high);
        return (int) (Math.round(result*10.0)/10.0);
    }

    @Override
    public String toString() {
        return "TemperatureSensor " +
                "result: " + readValue();
    }

}

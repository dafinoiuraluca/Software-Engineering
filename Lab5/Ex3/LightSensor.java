package Lab5.Ex3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LightSensor extends Sensor {
    public int readValue() {
        Random rand = new Random();

        double low = 0;
        double high = 100;
        double result = ThreadLocalRandom.current().nextDouble(high - low) + low;
        return (int) (Math.round(result*10.0)/10.0);
    }


    @Override
    public String toString() {
        return "LightSensor " +
                "rand: " + readValue();
    }

}

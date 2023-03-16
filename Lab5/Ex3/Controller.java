package Lab5.Ex3;

import java.util.Timer;
import java.util.TimerTask;

public class Controller {
    private static volatile Controller instance = null;
    private Controller() { }

    public static Controller getInstance() {
        synchronized (Controller.class) {
            if (instance == null) {
                instance = new Controller();
            }
        }

        return instance;
    }


    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        LightSensor lightSensor = new LightSensor();


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(temperatureSensor);
                System.out.println(lightSensor);
                System.out.println("\n");
            }
        }, 20000, 1000);
    }
}

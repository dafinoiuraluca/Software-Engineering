package Lab7.Ex4;

import java.io.*;

public class InputCar {

    Car createCar(String model, int price) {
        Car car = new Car(model, price);
        System.out.println("The car you created is the model " + model + "and has the price " + price);
        return car;
    }

    void storeCar(Car car, String store) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(store));
        outputStream.writeObject(car);
        System.out.println("The car with the model " + car.getModel() + "and the price " + car.getPrice() + "is stored");
    }


    public static Object readObjectFromFile(String file) throws IOException, ClassNotFoundException {
        Object result = null;
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            result = ois.readObject();
        }
        return result;
    }
}

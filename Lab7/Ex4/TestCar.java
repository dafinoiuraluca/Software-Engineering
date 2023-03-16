package Lab7.Ex4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCar {
//    private static final String filepath = "D:/Facultate/car.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputCar inputCar = new InputCar();

        Car c1 = inputCar.createCar("Renault", 4000);
        Car c2 = inputCar.createCar("Peugeot", 35000);

        inputCar.storeCar(c1, "c1.txt");
        inputCar.storeCar(c2, "c2.txt");

        System.out.println(c1);
        System.out.println(c2);

//        TestCar testCar = new TestCar();
//
//        ArrayList<Car> cars = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String model;
//        int price;
//
//        while(cars.size() < 10) {
//            Car c = new Car();
//            System.out.println("Give the model of the care you want to add: ");
//            c.setModel(scanner.nextLine());
//            System.out.println("Now give the price: ");
//            c.setPrice(scanner.nextInt());
//            price = scanner.nextInt();
//            cars.add(c);
//            testCar.writeObjectToFile(c);
//        }
//
//
//
//        Car c1 = (Car) readObjectFromFile(filepath);
//        System.out.println("The model of the car is " + c1.getModel() + " and the price is " + c1.getPrice());

//        Car car2 = new Car("Volkswagen", 15000);
//        testCar.writeObjectToFile(car2);
//
//        Car c2 = (Car) readObjectFromFile(filepath);
//        System.out.println(c2);
//        System.out.println(c2.getPrice());
//        System.out.println(c2.getModel());


    }

}

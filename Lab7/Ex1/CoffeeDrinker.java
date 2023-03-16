package Lab7.Ex1;

public class CoffeeDrinker {
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException, NumberOfCoffees {
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Coffee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Coffee concentration to high!");
        System.out.println("Drink coffee:" + c);
        if(c.getNo_of_coffees() > 10) {
            throw new NumberOfCoffees(c.getNo_of_coffees(), "Too many coffees!");
        }
    }


}

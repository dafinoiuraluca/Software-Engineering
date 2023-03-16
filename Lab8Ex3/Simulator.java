package Lab8.Ex3;

import java.util.ArrayList;

public class Simulator {
    public static void main(String[] args) {

        //build station Cluj-Napoca
        Controller c1 = new Controller("Cluj-Napoca");

        Segment s1 = new Segment(1);
        Segment s2 = new Segment(2);
        Segment s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //build station Bucuresti
        Controller c2 = new Controller("Bucuresti");

        Segment s4 = new Segment(4);
        Segment s5 = new Segment(5);
        Segment s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);

        //build station Satu Mare
        Controller c3 = new Controller("Satu Mare");


        Segment s7 = new Segment(7);
        Segment s8 = new Segment(8);
        Segment s9 = new Segment(9);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);
        c3.addControlledSegment(s9);

        //build station Oradea
        Controller c4 = new Controller("Oradea");

        Segment s10 = new Segment(10);
        Segment s11 = new Segment(11);
        Segment s12 = new Segment(12);

        c4.addControlledSegment(s10);
        c4.addControlledSegment(s11);
        c4.addControlledSegment(s12);

        //connect the 2 controllers
        c1.setNeighbourController(c2);
        c2.setNeighbourController(c1);

        c3.setNeighbourController(c4);
        c4.setNeighbourController(c3);

        c2.setNeighbourController(c4);
        c4.setNeighbourController(c2);

        c1.setNeighbourController(c3);
        c3.setNeighbourController(c1);

        //testing

        Train t1 = new Train("Bucuresti", "IC-001");

        Train t2 = new Train("Cluj-Napoca", "R-002");

        Train t3 = new Train("Satu Mare", "IRN-1741");

        Train t4 = new Train("Oradea", "IR-408");

        s1.arriveTrain(t1);
        s2.arriveTrain(t4);

        s4.arriveTrain(t3);
        s5.arriveTrain(t2);

        s7.arriveTrain(t1);
        s9.arriveTrain(t4);

        s10.arriveTrain(t2);
        s11.arriveTrain(t1);

        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();
        c4.displayStationState();

        System.out.println("\nStart train control\n");

        //execute 3 times controller steps
        for (int i = 0; i < 3; i++) {
            System.out.println("### Step " + i + " ###");
            c1.controlStep();
            System.out.println("\n");
            c2.controlStep();
            System.out.println("\n");
            c3.controlStep();
            System.out.println("\n");
            c4.controlStep();

            System.out.println();

            c1.displayStationState();
            c2.displayStationState();
            c3.displayStationState();
            c4.displayStationState();
        }
    }
}

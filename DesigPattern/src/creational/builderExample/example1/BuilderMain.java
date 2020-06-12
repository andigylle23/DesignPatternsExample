package creational.builderExample.example1;

import creational.builderExample.example1.HouseBuilder.AmericanHouseBuilder;
import creational.builderExample.example1.HouseBuilder.Building;
import creational.builderExample.example1.HouseBuilder.JapaneseHouseBuilder;

public class BuilderMain {
    public static void main(String[] argv) {
        // Initialization of different categories of Builders
        Director d1 = new Director(new JapaneseHouseBuilder());
        Director d2 = new Director(new AmericanHouseBuilder());

        // Assign the initialize object
        Building b1 = d1.construct();
        Building b2 = d2.construct();

        // Display the output
        System.out.println("Japanese Home Builder: " + b1);
        System.out.println("American Home Builder: " + b2);
    }
}

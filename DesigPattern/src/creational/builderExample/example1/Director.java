package creational.builderExample.example1;

import creational.builderExample.example1.HouseBuilder.Building;
import creational.builderExample.example1.Interface.IBuilder;

/**
 * Create a Director management class
 */
public class Director {
    // Declaration
    private IBuilder builder;

    // Initialize
    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public Building construct() {
        this.builder.buildBase();
        this.builder.buildFrame();
        this.builder.buildWall();

        return this.builder.getResult();
    }
}

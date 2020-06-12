package creational.builderExample.example1.Interface;

import creational.builderExample.example1.HouseBuilder.Building;

/**
 * Create an interface where it can
 * be used on other class
 */
public interface IBuilder {
    void buildBase();
    void buildFrame();
    void buildWall();
    Building getResult();
}

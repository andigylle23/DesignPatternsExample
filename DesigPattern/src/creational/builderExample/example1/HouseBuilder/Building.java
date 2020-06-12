package creational.builderExample.example1.HouseBuilder;

import creational.builderExample.example1.Material.EMaterial;

/**
 * Create a setter class
 */
public class Building {
    // Declaration
    private EMaterial base;
    private EMaterial frame;
    private EMaterial wall;

    // Create a setter for base
    public void setBase(EMaterial m) {
        this.base = m;
    }
    // Create a setter for wall
    public void setWall(EMaterial m) {
        this.frame = m;
    }
    // Create a setter for frame
    public void setFrame(EMaterial m) {
        this.wall = m;
    }

    /**
     * Building components
     * @return building components
     */
    public String toString() {
        return "[Base: " + this.base + ", Frame: " + this.frame + ", Wall: " + this.wall + "]";
    }
}

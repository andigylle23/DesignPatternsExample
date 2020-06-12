package creational.builderExample.example1.HouseBuilder;

import creational.builderExample.example1.Interface.IBuilder;
import creational.builderExample.example1.Material.EMaterial;

/**
 * Setting a new category of builder
 */
public class JapaneseHouseBuilder implements IBuilder {
    // Declare the setter
    private Building building;

    // Initialize the setter into new
    public JapaneseHouseBuilder() {
        this.building = new Building();
    }

    // Set the method buildBase based on Material
    public void buildBase() {
        this.building.setBase(EMaterial.CONCRETE);
    }
    // Set the method buildFrame based on Material
    public void buildFrame() {
        this.building.setFrame(EMaterial.WOOD);
    }
    // Set the method buildWall based on Material
    public void buildWall() {
        this.building.setWall(EMaterial.CLAY);
    }

    /**
     * Override the getResult from Building
     * @return newly set building
     */
    @Override
    public Building getResult() {
        return this.building;
    }
}

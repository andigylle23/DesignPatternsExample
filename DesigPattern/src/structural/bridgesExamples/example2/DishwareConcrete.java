package structural.bridgesExamples.example2;

import javax.swing.text.MaskFormatter;

public class DishwareConcrete extends Dishware{
    private String material = "";
    private String type = "";

    public DishwareConcrete(String material, String type, MaterialAPI materialAPI) {
        super(materialAPI);
        this.material = material;
        this.type = type;
    }

    public void assignMaterial() {
        materialAPI.getMaterial(material, type);
    }
}

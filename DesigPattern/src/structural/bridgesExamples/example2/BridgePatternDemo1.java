package structural.bridgesExamples.example2;

public class BridgePatternDemo1 {
    public static void main(String[] args) {
        Dishware glassPlate = new DishwareConcrete("glass", "plate",  new Glass());
        Dishware glassBowl = new DishwareConcrete("glass", "bowl",  new Glass());
        Dishware woodPlate = new DishwareConcrete("wood" , "plate", new Wood());
        Dishware woodBowl = new DishwareConcrete("wood" , "bowl", new Wood());

        glassPlate.assignMaterial();
        glassBowl.assignMaterial();
        woodPlate.assignMaterial();
        woodBowl.assignMaterial();
    }
}

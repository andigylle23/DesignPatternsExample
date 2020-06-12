package structural.bridgesExamples.example2;

public class Glass implements MaterialAPI {
    @Override
    public void getMaterial(String material, String type) {
        System.out.println("This is a " + type +  " and the material is " + material);
    }
}

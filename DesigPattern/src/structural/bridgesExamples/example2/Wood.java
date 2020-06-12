package structural.bridgesExamples.example2;

public class Wood  implements  MaterialAPI{
    @Override
    public void getMaterial(String material, String type) {
        System.out.println("This is a " + type + " and material is " + material);
    }
}

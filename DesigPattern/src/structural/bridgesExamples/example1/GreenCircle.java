package structural.bridgesExamples.example1;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.print("Drawing Circle[color: green, radius: " + radius + ", x: " + x + ", " + y);
    }
}

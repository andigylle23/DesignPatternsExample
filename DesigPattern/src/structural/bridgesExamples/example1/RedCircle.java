package structural.bridgesExamples.example1;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle: red, radius: " + radius + ", x: " + x + ", " + y);
    }
}

package structural.bridgesExamples.example1;

public class Circle extends Shape {
    private int x = 0;
    private int y = 0;
    private int radius = 0;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

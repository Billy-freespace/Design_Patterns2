package grphicEditor;

public class Dot implements Graphic {
    private double x, y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Punto (x, y) = (" + x + "," + y + ").");
    }
}

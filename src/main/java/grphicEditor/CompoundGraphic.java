package grphicEditor;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> children;

    public CompoundGraphic() {
        children = new ArrayList<Graphic>();
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(double x, double y) {
        System.out.println("CompoundGraphic.move()");
        for (Graphic child: children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("CompoundGraphic.draw()");
        for (Graphic child: children) {
            child.draw();
        }
        //System.out.println("Dibujando rectángulo de línea punteada");
    }
}

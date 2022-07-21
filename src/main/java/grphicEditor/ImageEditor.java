package grphicEditor;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class ImageEditor {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
    }

    public void groupSelected(ArrayList<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component: components) {
            group.add(component);
            all.remove(component);
            all.add(group);
        }
        all.draw();
    }

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load();
        Dot dot = new Dot(1.2, 3.4);
        Circle circle = new Circle(5.6, 7.8, 10);
        CompoundGraphic nestedComponents = new CompoundGraphic();
        nestedComponents.add(new Dot(11, 12));
        nestedComponents.add(new Circle(14, 15, 20.25));
        Graphic[] graphics = new Graphic[] {dot, circle, nestedComponents};
        ArrayList<Graphic> components = Arrays<Graphic>.asList(graphics);

        imageEditor.groupSelected(components);

    }

}

package composite;

import java.util.List;
import java.util.Vector;

public class Composite implements Component{
    private List<Component> children;
    private String name; // only for testing purpose

    Composite(String name){
        children = new Vector<Component>();
        this.name = name;
    }

    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    public List<Component> getChildren(){
        return children;
    }

    @Override
    public void execute(){
        System.out.println("Running Compite(name="+name + ").execute()");
        for(Component component : children){
            component.execute();
        }
    }
}

package composite.leafs;

import composite.Component;

public class Hammer implements Component { // leaf
    @Override
    public void execute(){
        System.out.println("Running Hammer.execute() method");
    }
}

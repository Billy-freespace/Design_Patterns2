package composite.leafs;

import composite.Component;

public class Charger implements Component { // leaf
    @Override
    public void execute(){
        System.out.println("Running Charger.execute() method");
    }
}
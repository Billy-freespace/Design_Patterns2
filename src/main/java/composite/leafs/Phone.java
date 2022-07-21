package composite.leafs;

import composite.Component;

public class Phone implements Component { // leaf
    @Override
    public void execute(){
        System.out.println("Running Phone.execute() method");
    }
}
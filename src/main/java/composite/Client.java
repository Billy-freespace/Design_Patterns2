package composite;

import composite.leafs.Charger;
import composite.leafs.Hammer;
import composite.leafs.Phone;

public class Client {

    public static void main(String[] args){
        // initialization of tree of objects (composite structure)
        Composite composite = new Composite("Main Composite");
        composite.add(new Hammer());
        composite.add(new Charger());

        Composite nestedComposite = new Composite("Nested Composite");
        nestedComposite.add(new Phone());

        composite.add(nestedComposite);



        // client only know that objects that implement <<interface>> Component have execute() method
        composite.execute();
    }
}

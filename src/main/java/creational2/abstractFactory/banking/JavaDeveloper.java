package creational2.abstractFactory.banking;

import creational2.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code ...");
    }
}

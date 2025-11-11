package creational2.abstractFactory.website;

import creational2.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php codes ...");
    }
}

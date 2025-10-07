package bihavioralPatterns.iterator;

public class NameRepository {

    private String[] names = {"Adam", "Ana", "Kevin", "Michael"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}

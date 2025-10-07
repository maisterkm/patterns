package bihavioralPatterns.iterator;

public class NameIterator implements Iterator{

    private String [] names;
    private int index;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hssNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if(hssNext())
            return names[index++];
        return null;
    }
}

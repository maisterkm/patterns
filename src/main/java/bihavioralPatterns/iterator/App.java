package bihavioralPatterns.iterator;

public class App {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for(Iterator it = repository.getIterator(); it.hssNext();) {
            String name = (String) it.next();
            System.out.println(name);
        }
    }
}

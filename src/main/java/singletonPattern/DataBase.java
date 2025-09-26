package singletonPattern;

public enum DataBase {

    //aquiring the INSTANCE is thread safe
    INSTANCE;

    public void connect() {
        System.out.println("Connecting to the database ...");
    }

    public void disconnect() {
        System.out.println("Disconnecting to the database ...");
    }
}

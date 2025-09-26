package singletonPattern;

public class DataBaseConnector {

    //lazy version
    private static DataBaseConnector INSTANCE;

    //we are not able to instantiate the class
    //"reflection attack"
    private DataBaseConnector() {
    }

    public static DataBaseConnector getInstance() {

        //we just instantiate the class if necessary
        //IF WE HAVE MULTIPLE THREADS???
        if(INSTANCE == null) {
            //this block can be entered by a single thread
            //PROBLEM: it is to slow (100x)
            synchronized (DataBaseConnector.class) {
                INSTANCE = new DataBaseConnector();
            }
        }
        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database ...");
    }

    public void disconnect() {
        System.out.println("Disconnecting to the database ...");
    }
}

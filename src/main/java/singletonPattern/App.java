package singletonPattern;

public class App
{
    public static void main( String[] args )
    {

        DataBaseConnector dbc1 = DataBaseConnector.getInstance();
        DataBaseConnector dbc2 = DataBaseConnector.getInstance();

        DataBase db1 = DataBase.INSTANCE;
        DataBase db2 = DataBase.INSTANCE;

        if (dbc1 == dbc2) {
            System.out.println("The objects are the same ...");
        }

        if (db1 == db2) {
            System.out.println("The objects are the same ...");
        }
    }
}

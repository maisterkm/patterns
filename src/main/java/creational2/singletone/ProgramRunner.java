package creational2.singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLoger().addLogInfo("First log ...");
        ProgramLogger.getProgramLoger().addLogInfo("Second log ...");
        ProgramLogger.getProgramLoger().addLogInfo("Third log ...");

        ProgramLogger.getProgramLoger().showLogFile();
    }
}

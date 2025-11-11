package creational2.abstractFactory.banking;

import creational2.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project ...");
    }
}

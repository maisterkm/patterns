package creational2.abstractFactory;

import creational2.abstractFactory.banking.BankinTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankinTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjecManager();

        System.out.println("Creating bank system ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

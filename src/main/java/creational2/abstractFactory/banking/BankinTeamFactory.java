package creational2.abstractFactory.banking;

import creational2.abstractFactory.Developer;
import creational2.abstractFactory.ProjectManager;
import creational2.abstractFactory.ProjectTeamFactory;
import creational2.abstractFactory.Tester;

public class BankinTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjecManager() {
        return new BankingPM();
    }
}

package creational2.abstractFactory.website;

import creational2.abstractFactory.Developer;
import creational2.abstractFactory.ProjectManager;
import creational2.abstractFactory.ProjectTeamFactory;
import creational2.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjecManager() {
        return new WebsitePM();
    }
}

package creational2.abstractFactory;

import creational2.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjecManager();

        System.out.println("Creating auction website ...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

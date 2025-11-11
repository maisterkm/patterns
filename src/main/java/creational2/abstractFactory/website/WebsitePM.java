package creational2.abstractFactory.website;

import creational2.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM maneges Website project ...");
    }
}

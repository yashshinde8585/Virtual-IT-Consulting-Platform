package model;

public class Project {
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public void showProjectDetails() {
        System.out.println("Project: " + projectName);
    }
}

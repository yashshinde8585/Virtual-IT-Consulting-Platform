package main;

import model.*;

public class VirtualITConsultingApp {
    public static void main(String[] args) {
        // Create Client
        Client client1 = new Client("Alice", "alice@example.com", "TechCorp");
        client1.displayInfo();
        client1.role();
        client1.requestService();

        // Create Employees
        Developer dev = new Developer("Bob", "bob@itconsulting.com", 101, "Java");
        Analyst analyst = new Analyst("Carol", "carol@itconsulting.com", 102);
        Manager manager = new Manager("Dave", "dave@itconsulting.com", 103);

        dev.displayInfo();
        dev.role();
        dev.developSoftware();

        analyst.displayInfo();
        analyst.role();
        analyst.analyzeRequirements();

        manager.displayInfo();
        manager.role();
        manager.conductMeeting();

        // Polymorphism with Service interface
        Service cloud = new CloudService();
        Service web = new WebDevService();

        cloud.provideService();
        web.provideService();

        // Polymorphism with abstract Meeting class
        Meeting clientMeeting = new ClientMeeting("Project Kick-off");
        Meeting teamMeeting = new TeamMeeting("Weekly Progress");

        clientMeeting.conduct();
        teamMeeting.conduct();

        // Show project
        Project project = new Project("AI-based Analytics Tool");
        project.showProjectDetails();
    }
}

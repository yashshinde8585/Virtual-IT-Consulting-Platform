package model;

public class Manager extends Employee {
    public Manager(String name, String email, int employeeId) {
        super(name, email, employeeId);
    }

    @Override
    public void role() {
        System.out.println(name + " is a Manager overseeing projects.");
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting.");
    }
}

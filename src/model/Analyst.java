package model;

public class Analyst extends Employee {
    public Analyst(String name, String email, int employeeId) {
        super(name, email, employeeId);
    }

    @Override
    public void role() {
        System.out.println(name + " is a Business Analyst.");
    }

    public void analyzeRequirements() {
        System.out.println(name + " is analyzing project requirements.");
    }
}

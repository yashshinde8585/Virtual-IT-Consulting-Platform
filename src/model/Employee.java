package model;

public abstract class Employee extends Person {
    protected int employeeId;

    public Employee(String name, String email, int employeeId) {
        super(name, email);
        this.employeeId = employeeId;
    }

    // Common behavior for employees
    public void work() {
        System.out.println(name + " is working on a project.");
    }
}

// Base class to demonstrate inheritance and abstraction
package model;

public abstract class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Common method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    // Abstract method (polymorphism) to be implemented by subclasses
    public abstract void role();
}

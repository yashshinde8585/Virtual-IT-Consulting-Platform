package model;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String email, int employeeId, String programmingLanguage) {
        super(name, email, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void role() {
        System.out.println(name + " is a Developer proficient in " + programmingLanguage);
    }

    public void developSoftware() {
        System.out.println(name + " is developing software using " + programmingLanguage);
    }
}

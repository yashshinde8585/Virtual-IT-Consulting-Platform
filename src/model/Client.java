package model;

public class Client extends Person {
    private String company;

    public Client(String name, String email, String company) {
        super(name, email);
        this.company = company;
    }

    @Override
    public void role() {
        System.out.println(name + " is a Client from " + company);
    }

    public void requestService() {
        System.out.println(name + " is requesting a new service.");
    }
}

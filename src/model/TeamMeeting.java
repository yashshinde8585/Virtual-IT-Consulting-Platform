package model;

public class TeamMeeting extends Meeting {
    public TeamMeeting(String topic) {
        super(topic);
    }

    @Override
    public void conduct() {
        System.out.println("Conducting team meeting on: " + topic);
    }
}

package model;

public class ClientMeeting extends Meeting {
    public ClientMeeting(String topic) {
        super(topic);
    }

    @Override
    public void conduct() {
        System.out.println("Conducting client meeting on: " + topic);
    }
}

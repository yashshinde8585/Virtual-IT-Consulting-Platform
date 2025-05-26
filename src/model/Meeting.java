package model;

public abstract class Meeting {
    protected String topic;

    public Meeting(String topic) {
        this.topic = topic;
    }

    public abstract void conduct();
}

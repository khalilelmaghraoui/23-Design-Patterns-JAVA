package com.Bridge;

public abstract class Message {
    public Sender sender;
    public String subject;
    public String body;

    public abstract void send();

}

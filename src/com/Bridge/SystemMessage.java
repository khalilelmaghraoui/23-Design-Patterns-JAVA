package com.Bridge;

public class SystemMessage extends Message {
    @Override
    public void send() {
        sender.sendMessage(subject,body);

    }
}

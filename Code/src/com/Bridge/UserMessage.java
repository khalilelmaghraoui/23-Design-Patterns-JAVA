package com.Bridge;

public class UserMessage extends Message {

public  String UserComments;

    @Override
    public void send(){
        String fullBody = body + " User Comments " + UserComments;

        sender.sendMessage(subject,fullBody);

    }
}

package com.Bridge;

public class OutlookSender implements Sender {
    @Override
    public void sendMessage(String sub, String body) {
        System.out.println("Outlook " + sub +
            " - "
        + body);

    }
}

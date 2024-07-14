package com.example.chatbot;

public class Message {
    private final String text;
    private final boolean usersentMessage;

    public Message(String text, boolean usersentMessage) {
        this.text = text;
        this.usersentMessage = usersentMessage;
    }

    public String getText() {
        return text;
    }

    public boolean SentByUser() {
        return usersentMessage;
    }
}

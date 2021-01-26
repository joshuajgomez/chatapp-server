package com.joshgm3z.chatappserver;

public class ChatDTO {

    private String mMessage;

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    @Override
    public String toString() {
        return "ChatDTO{" +
                "mMessage='" + mMessage + '\'' +
                '}';
    }
}

package com.joshgm3z.chatappserver;

public class ChatDTO {

    private String message;
    private long time;
    private String fromUser;
    private String toUser;

    public ChatDTO(String message, long time, String fromUser, String toUser) {
        this.message = message;
        this.time = time;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String mMessage) {
        this.message = mMessage;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    @Override
    public String toString() {
        return "ChatDTO{" +
                "message='" + message + '\'' +
                ", time=" + time +
                ", fromUser='" + fromUser + '\'' +
                ", toUser='" + toUser + '\'' +
                '}';
    }
}

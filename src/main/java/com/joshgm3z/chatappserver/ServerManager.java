package com.joshgm3z.chatappserver;

import java.util.ArrayList;
import java.util.List;

public class ServerManager {

    private List<String> mMessageList;

    public ServerManager(){
        mMessageList = new ArrayList<>();
    }

    public void sendMessage(String message){
        mMessageList.add(message);
    }

    public List<String> getMessageList(){
        return mMessageList;
    }

}

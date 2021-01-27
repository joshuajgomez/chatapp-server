package com.joshgm3z.chatappserver;

import com.joshgm3z.chatappserver.common.utils.JsonConverter;

import java.util.ArrayList;
import java.util.List;

public class ServerManager {

    private List<ChatDTO> mChatList;

    public ServerManager(){
        mChatList = new ArrayList<>();
    }

    public void sendMessage(ChatDTO chatDTO){
        mChatList.add(chatDTO);
        System.out.println("Chat added: " + chatDTO);
    }

    public String getChatList(){
        return new JsonConverter().convertToJsonArray(mChatList).toString();
    }

}

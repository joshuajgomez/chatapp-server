package com.joshgm3z.chatappserver;

import com.joshgm3z.chatappserver.common.utils.JsonConverter;
import com.joshgm3z.chatappserver.common.data.ChatDTO;

import java.util.ArrayList;
import java.util.List;

public class AppService {

    private List<ChatDTO> mChatList;

    public AppService(){
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

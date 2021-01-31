package com.joshgm3z.chatappserver.service;

import com.joshgm3z.chatappserver.common.utils.JsonConverter;
import com.joshgm3z.chatappserver.common.data.ChatDTO;

import java.util.ArrayList;
import java.util.List;

public class ChatService {

    private List<ChatDTO> mChatList;

    public ChatService() {
        mChatList = new ArrayList<>();
    }

    public int sendMessage(ChatDTO chatDTO) {
        mChatList.add(chatDTO);
        System.out.println("Chat added: " + chatDTO);
        return mChatList.size() - 1;
    }

    public List<ChatDTO> getChatList() {
        return mChatList;
    }

    public List<ChatDTO> getChatListForUser(String username) {
        List<ChatDTO> chatList = new ArrayList<>();
        for (ChatDTO chatDTO : mChatList) {
            if (chatDTO.getFromUser().equals(username) || chatDTO.getToUser().equals(username)) {
                chatList.add(chatDTO);
            }
        }
        return chatList;
    }

    public List<ChatDTO> getChatsBetweenUsers(String username1, String username2) {
        List<ChatDTO> chatList = new ArrayList<>();
        for (ChatDTO chatDTO : mChatList) {
            if ((chatDTO.getFromUser().equals(username1) && chatDTO.getToUser().equals(username2))
                    || (chatDTO.getFromUser().equals(username2) && chatDTO.getToUser().equals(username1))) {
                chatList.add(chatDTO);
            }
        }
        return chatList;
    }
}

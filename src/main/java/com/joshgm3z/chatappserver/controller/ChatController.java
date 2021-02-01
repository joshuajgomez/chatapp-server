package com.joshgm3z.chatappserver.controller;

import com.joshgm3z.chatappserver.common.data.ChatDTO;
import com.joshgm3z.chatappserver.service.ChatService;
import com.joshgm3z.chatappserver.common.utils.JsonConverter;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private ChatService mChatService;

    public ChatController(){
        mChatService = new ChatService();
    }

    @PostMapping(path ="/send")
    public ResponseEntity sendMessage(@RequestBody ChatDTO chatDTO){
        int id = mChatService.sendMessage(chatDTO);
        return JsonConverter.createChatAddedResponse(id);
    }

    @GetMapping(path ="/list_all_chats_for_user")
    public ResponseEntity getAllChatsForUser(@RequestParam String username){
        System.out.println("getAllChatsForUser username=" + username);
        List<ChatDTO> chatList = mChatService.getChatListForUser(username);
        return JsonConverter.createChatListResponse(chatList);
    }

    @GetMapping(path ="/list_chats_between_users")
    public ResponseEntity getChatsBetweenUsers(@RequestParam String username1, @RequestParam String username2){
        System.out.println("getChatsBetweenUsers username1=" + username1 + ", username2=" + username2);
        List<ChatDTO> chatList = mChatService.getChatsBetweenUsers(username1, username2);
        return JsonConverter.createChatListResponse(chatList);
    }

    @GetMapping(path ="/list_all")
    public ResponseEntity getChatList(){
        List<ChatDTO> chatList = mChatService.getChatList();
        return JsonConverter.createChatListResponse(chatList);
    }

    @GetMapping(path ="/test")
    public String getTestResult(){
        return "Test successful";
    }

}

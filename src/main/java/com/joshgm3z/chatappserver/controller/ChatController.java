package com.joshgm3z.chatappserver.controller;

import com.joshgm3z.chatappserver.common.data.ChatDTO;
import com.joshgm3z.chatappserver.common.data.UserDTO;
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

    @PostMapping(path ="/add")
    public String addUser(@RequestBody UserDTO userDTO){
//        boolean status = mUserService.addUser(userDTO);
//        return JsonConverter.createUserAddedResponse(userDTO.getUsername(), status);
        return "User added: " + userDTO;
    }
    @PostMapping(path ="/send")
    public ResponseEntity sendMessage(@RequestBody ChatDTO chatDTO){
        int id = mChatService.sendMessage(chatDTO);
        return JsonConverter.createChatAddedResponse(id);
    }

    @PostMapping(path ="/list_all")
    public ResponseEntity getChatList(){
        List<ChatDTO> chatList = mChatService.getChatList();
        return JsonConverter.createChatListResponse(chatList);
    }

    @GetMapping(path ="/test")
    public String getTestResult(){
        return "Test successful";
    }

}

package com.joshgm3z.chatappserver;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class AppController {

    ServerManager mServerManager;

    public AppController(){
        mServerManager = new ServerManager();
    }

    @PostMapping(path ="/send", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String sendMessage(@RequestBody ChatDTO chatDTO){
        mServerManager.sendMessage(chatDTO);
        return "Added chat > " + chatDTO;
    }

    @PostMapping(path ="/list_all")
    public String getChatList(){
        String chatList = mServerManager.getChatList();
        return chatList;
    }

}

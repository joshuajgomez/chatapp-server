package com.joshgm3z.chatappserver.controller;

import com.joshgm3z.chatappserver.common.data.ChatDTO;
import com.joshgm3z.chatappserver.AppService;
import com.joshgm3z.chatappserver.common.utils.JsonConverter;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chat")
public class AppController {

    private AppService mAppService;

    public AppController(){
        mAppService = new AppService();
    }

    @PostMapping(path ="/send", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity sendMessage(@RequestBody ChatDTO chatDTO){
        int id = mAppService.sendMessage(chatDTO);
        String body = JsonConverter.convertToJsonObject(id).toString();
        return new ResponseEntity(body, HttpStatus.OK);
    }

    @PostMapping(path ="/list_all")
    public ResponseEntity getChatList(){
        String body = mAppService.getChatList();
        return new ResponseEntity(body, HttpStatus.OK);
    }

    @GetMapping(path ="/test")
    public String getTestResult(){
        return "Test successful";
    }

}

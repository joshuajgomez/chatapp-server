package com.joshgm3z.chatappserver;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @RequestMapping(method = RequestMethod.POST, path ="/send")
    public ResponseEntity<Void> sendMessage(@RequestBody ChatDTO chatDTO){

        System.out.println("/send chatDTO = [" + chatDTO + "]");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping("/testJoshOk")
    public ResponseEntity<Void> testMessage(){

        System.out.println("/testJosh testMessage");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping("/testJoshNok")
    public ResponseEntity<Void> testMessageNotFound(){

        System.out.println("/testJosh testMessage");
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }
}

package com.joshgm3z.chatappserver.controller;

import com.joshgm3z.chatappserver.common.data.UserDTO;
import com.joshgm3z.chatappserver.common.utils.JsonConverter;
import com.joshgm3z.chatappserver.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService mUserService;

    public UserController(){
        mUserService = new UserService();
    }

    @PostMapping(path ="/add")
    public ResponseEntity addUser(@RequestBody UserDTO userDTO){
        int id = mUserService.addUser(userDTO);
        System.out.println("addUser id=" + id);
        return JsonConverter.createUserAddedResponse(userDTO, id);
    }

    @PostMapping(path ="/checkUser")
    public ResponseEntity checkUser(@RequestBody UserDTO userDTO){
        boolean isUserFound = mUserService.checkUser(userDTO);
        System.out.println("checkUser " + userDTO + " isUserFound=" + isUserFound);
        return JsonConverter.createCheckUserResponse(isUserFound);
    }

    @PostMapping(path ="/list_users")
    public ResponseEntity getUsers(){
        List<UserDTO> userList = mUserService.getUserList();
        System.out.println("getUsers userList=" + userList);
        return JsonConverter.createUserListResponse(userList);
    }

    @GetMapping(path = "/test")
    public String test(){
        return "Test successful!";
    }

}

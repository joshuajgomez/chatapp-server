package com.joshgm3z.chatappserver.service;

import com.joshgm3z.chatappserver.common.data.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<UserDTO> mUserList;

    public UserService(){
        mUserList = new ArrayList<>();
    }

    public boolean addUser(UserDTO userDTO){
        System.out.println("User added: " + userDTO);
        return mUserList.add(userDTO);
    }

    public String checkUser(UserDTO userDTO){
        boolean isUserFound = false;
        for (UserDTO user : mUserList) {
            if (user.getUsername().equals(userDTO.getUsername())) {
                isUserFound = true;
                break;
            }
        }
        return isUserFound ? "true" : "false";
    }

    public List<UserDTO> getUserList() {
        return mUserList;
    }
}

package com.joshgm3z.chatappserver.service;

import com.joshgm3z.chatappserver.common.data.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<UserDTO> mUserList;

    public UserService(){
        mUserList = new ArrayList<>();
    }

    public int addUser(UserDTO userDTO){
        System.out.println("User added: " + userDTO);
        mUserList.add(userDTO);
        return mUserList.size() - 1;
    }

    public boolean checkUser(UserDTO userDTO){
        boolean isUserFound = false;
        for (UserDTO user : mUserList) {
            if (user.getUsername().equals(userDTO.getUsername())) {
                isUserFound = true;
                break;
            }
        }
        return isUserFound;
    }

    public List<UserDTO> getUserList() {
        return mUserList;
    }

    public List<UserDTO> getUserListExcluding(String username) {
        List<UserDTO> excludedList = new ArrayList<>();
        for (UserDTO userDTO : mUserList) {
            if (!userDTO.getUsername().equals(username)) {
                excludedList.add(userDTO);
            }
        }
        return excludedList;
    }
}

package com.joshgm3z.chatappserver.common.utils;

import com.joshgm3z.chatappserver.common.data.ChatDTO;
import com.joshgm3z.chatappserver.common.data.UserDTO;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class JsonConverter {

    public static ResponseEntity createChatListResponse(List<ChatDTO> chatDTOList){
        JSONArray jsonArray = new JSONArray();
        for (ChatDTO chatDTO : chatDTOList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", chatDTO.getMessage());
            jsonObject.put("time", chatDTO.getTime());
            jsonObject.put("fromUser", chatDTO.getFromUser());
            jsonObject.put("toUser", chatDTO.getToUser());
            jsonArray.put(jsonObject);
        }
        return new ResponseEntity(jsonArray.toString(), HttpStatus.OK);
    }

    public static ResponseEntity createChatAddedResponse(int id){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", 200);
        jsonObject.put("message", "Chat added");
        jsonObject.put("id", id);
        return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
    }

    public static ResponseEntity createUserAddedResponse(String userName, boolean status){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", 200);
        jsonObject.put("message", "User added: " + status);
        jsonObject.put("userName", userName);
        return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
    }

    public static ResponseEntity createUserListResponse(List<UserDTO> userList) {
        JSONArray jsonArray = new JSONArray();
        for (UserDTO userDTO : userList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userName", userDTO.getUsername());
        }
        return new ResponseEntity(jsonArray.toString(), HttpStatus.OK);
    }
}

package com.joshgm3z.chatappserver.common.utils;

import com.joshgm3z.chatappserver.common.data.ChatDTO;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JsonConverter {

    public static JSONArray convertToJsonArray(List<ChatDTO> chatDTOList){
        JSONArray jsonArray = new JSONArray();
        for (ChatDTO chatDTO : chatDTOList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", chatDTO.getMessage());
            jsonObject.put("time", chatDTO.getTime());
            jsonObject.put("fromUser", chatDTO.getFromUser());
            jsonObject.put("toUser", chatDTO.getToUser());
            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }

    public static JSONObject convertToJsonObject(int id){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", 200);
        jsonObject.put("message", "Chat added");
        jsonObject.put("id", id);
        return jsonObject;
    }

}

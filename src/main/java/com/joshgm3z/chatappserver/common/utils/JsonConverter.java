package com.joshgm3z.chatappserver.common.utils;

import com.joshgm3z.chatappserver.ChatDTO;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JsonConverter {

    public JSONArray convertToJsonArray(List<ChatDTO> chatDTOList){
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

}

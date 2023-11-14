package com.example.repository;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictionaryRepository {
    private static Map<String, String> dictionaryMap = new LinkedHashMap<>();
    static {
        dictionaryMap.put("yellow", "vàng");
        dictionaryMap.put("blue", "xanh dương");
        dictionaryMap.put("green", "xanh lá");
        dictionaryMap.put("red", "đỏ");
        dictionaryMap.put("black", "đen");
        dictionaryMap.put("white", "trắng");
        dictionaryMap.put("pink", "hồng");
    }

    public Map<String, String> getAll(){
        return dictionaryMap;
    }
}

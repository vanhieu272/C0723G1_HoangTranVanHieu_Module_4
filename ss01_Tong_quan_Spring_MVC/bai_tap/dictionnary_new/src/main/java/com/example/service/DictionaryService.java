package com.example.service;

import com.example.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DictionaryService {

    @Autowired
    private DictionaryRepository dictionaryRepository;

    public Map<String, String> getAll(){
        return dictionaryRepository.getAll();
    }

    public String search(String vocab){
        return dictionaryRepository.search(vocab);
    }
}

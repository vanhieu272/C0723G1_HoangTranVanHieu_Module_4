package com.example.template.repository;

import com.example.template.model.Email;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepo implements IEmailRepo{
    private static List<Email> emailList = new ArrayList<>();
    private static List<String> languagesList  = new ArrayList<>();
    private static List<Integer> pages = new ArrayList<>();
    static {
        emailList.add(new Email(1, "Chinese", 25, false, "Thor"));

        languagesList.add("English");
        languagesList.add("Vietnamese");
        languagesList.add("Japanese");
        languagesList.add("Chinese");

        pages.add(5);
        pages.add(10);
        pages.add(15);
        pages.add(25);
        pages.add(50);
        pages.add(100);
    }
    @Override
    public Email showEmail() {
        return emailList.get(0);
    }

    @Override
    public Email findById(int id) {
        for(Email email :emailList){
            if (email.getId() == id){
                return email;
            }
        }
        return null;
    }

    @Override
    public void update(Email email) {
        for (Email email1 : emailList){
            if(email1.getId() == email.getId()){
                email1.setLanguages(email.getLanguages());
                email1.setPageSize(email.getPageSize());
                email1.setSpamsFilter(email.isSpamsFilter());
                email1.setSignature(email.getSignature());
                break;
            }
        }
    }

    @Override
    public List<String> getAllLanguagesList() {
        return languagesList;
    }

    @Override
    public List<Integer> getAllPages() {
        return pages;
    }
}

package com.example.validate_songs.controller;

import com.example.validate_songs.dto.SongDto;
import com.example.validate_songs.model.Song;
import com.example.validate_songs.service.ISongService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;
    @GetMapping
    public String showHome(Model model){
        model.addAttribute("songDto", new SongDto());
        return "/create";
    }

    @GetMapping("/validate")
    public String save(@Valid @ModelAttribute SongDto songDto, Model model,
                       BindingResult bindingResult){
        Song song = new Song();
        new SongDto().validate(songDto, bindingResult);

        if (bindingResult.hasErrors()){
            return "/create";
        }
        BeanUtils.copyProperties(songDto, song);
        songService.save(song);
        model.addAttribute("message", "Create new song is successfully!!");
        return "/result";
    }
}

package com.example.validate_songs.service;

import com.example.validate_songs.model.Song;
import com.example.validate_songs.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository songRepository;

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }

}

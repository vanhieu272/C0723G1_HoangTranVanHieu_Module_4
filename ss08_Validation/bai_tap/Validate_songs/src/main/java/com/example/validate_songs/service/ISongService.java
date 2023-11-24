package com.example.validate_songs.service;

import com.example.validate_songs.model.Song;
import org.springframework.data.domain.Page;

public interface ISongService {
    void save(Song song );
}

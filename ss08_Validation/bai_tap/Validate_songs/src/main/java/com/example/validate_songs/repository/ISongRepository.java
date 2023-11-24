package com.example.validate_songs.repository;

import com.example.validate_songs.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song, Integer> {
}

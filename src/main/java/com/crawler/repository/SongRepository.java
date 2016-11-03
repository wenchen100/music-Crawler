package com.crawler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crawler.model.Song;

public interface SongRepository extends JpaRepository<Song, String> {
    
    List<Song> findByCommentCountGreaterThan(Long commentCount);
    
}

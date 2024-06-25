package com.demo.Spring_Boot_App.repository;

import com.demo.Spring_Boot_App.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}

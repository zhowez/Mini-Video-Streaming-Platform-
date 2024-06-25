// File: VideoService.java
package com.demo.Spring_Boot_App.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.demo.Spring_Boot_App.model.Video;
import com.demo.Spring_Boot_App.repository.VideoRepository;


@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void uploadVideo(MultipartFile file) {
        // Handle file upload and save video details
        String videoPath = "path/to/saved/video";
        rabbitTemplate.convertAndSend("videoQueue", videoPath);
    }
}

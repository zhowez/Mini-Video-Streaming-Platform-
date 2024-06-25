// File: VideoService.java
package com.demo.Spring_Boot_App.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void uploadVideo(MultipartFile file) {
        // Handle file upload and save video details
        String videoPath = "path/to/saved/video";
        rabbitTemplate.convertAndSend("videoQueue", videoPath);
    }
}

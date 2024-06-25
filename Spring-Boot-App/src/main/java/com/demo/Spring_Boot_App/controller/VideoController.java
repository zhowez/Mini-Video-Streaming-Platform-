// File: VideoController.java
package com.demo.Spring_Boot_App.controller;

import com.demo.Spring_Boot_App.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @PostMapping("/upload")
    public String uploadVideo(MultipartFile file) {
        videoService.uploadVideo(file);
        return "Video uploaded successfully";
    }
}

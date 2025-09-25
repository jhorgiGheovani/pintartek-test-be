package com.jhorgispringproject.apivideoplayer.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Video {
    private String id;
    private String title;
    private String videoUrl;
    private String description;
    private String thumbnailUrl;
    private int duration;
    
    public Video(String id, String title, String videoUrl, String description, String thumbnailUrl, int duration) {
        this.id = id;
        this.title = title;
        this.videoUrl = videoUrl;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.duration = duration;
    }
}


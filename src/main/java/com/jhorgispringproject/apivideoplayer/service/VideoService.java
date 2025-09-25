package com.jhorgispringproject.apivideoplayer.service;

import com.jhorgispringproject.apivideoplayer.model.Video;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    private final List<Video> videos;

    public VideoService() {
        this.videos = getVideo();
    }

    private List<Video> getVideo() {
        List<Video> videos = new ArrayList<>();

        videos.add(new Video("1", "Big Buck Bunny",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4",
                "A classic animated short film for testing video players",
                "https://picsum.photos/320/180?random=1", 60));

        videos.add(new Video("2", "Elephant Dream",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4",
                "Another test video with different content",
                "https://picsum.photos/320/180?random=2", 15));

        videos.add(new Video("3", "For Bigger Blazes",
                "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4",
                "Short video perfect for mobile testing",
                "https://picsum.photos/320/180?random=3", 887));

        return videos;
    }

    public List<Video> getAllVideos() {
        return videos;
    }
}

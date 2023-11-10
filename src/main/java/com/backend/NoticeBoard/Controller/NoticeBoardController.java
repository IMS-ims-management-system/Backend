package com.backend.NoticeBoard.Controller;

import com.backend.NoticeBoard.Service.NoticeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NoticeBoard")
public class NoticeBoardController {

    private final NoticeBoardService noticeBoardService;

    @Autowired
    public NoticeBoardController(NoticeBoardService noticeBoardService) {
        this.noticeBoardService = noticeBoardService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/EmergencyBoard")
    public void EmergencyBoard() {

    }

    @PostMapping("/NoticeBoard")
    public void NoticeBoard() {

    }

    @PostMapping("/FreeBoard")
    public void FreeBoard() {

    }

    @PostMapping("/StudyBoard")
    public void StudyBoard() {

    }

    @PostMapping("/StorageBoard")
    public void StorageBoard() {

    }
}

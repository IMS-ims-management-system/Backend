package com.backend.NoticeBoard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NoticeBoard")
public class NoticeBoardController {

    @Autowired
    public NoticeBoardController() {
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

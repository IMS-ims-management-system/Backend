package com.backend.NoticeBoard.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeBoardService {
    private final NoticeBoardService noticeBoardService;

    @Autowired
    public NoticeBoardService(NoticeBoardService noticeBoardService) {
        this.noticeBoardService = noticeBoardService;
    }

    public void ServiceName(){

    }
}

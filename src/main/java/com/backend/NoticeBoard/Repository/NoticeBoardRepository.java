package com.backend.NoticeBoard.Repository;

import com.backend.NoticeBoard.Domain.Emergency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeBoardRepository extends JpaRepository<Emergency, Long> {

}

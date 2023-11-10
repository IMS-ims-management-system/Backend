package com.backend.NoticeBoard.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Emergency")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emergency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "index")
    private Integer index;

    @Column(name = "date")
    private String date;
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "type")
    private String type;
    @Column(name = "content")
    private String content;
}
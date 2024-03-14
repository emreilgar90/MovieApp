package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
@Table(name = "tbl_moviecomment")
public class ShowComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500)
    private String content;
    @Builder.Default
    private LocalDate commentDate= LocalDate.now();
    @ManyToOne
    private User user;
    @ManyToOne
    private Show show;


    public ShowComment(Long id, String content, LocalDate commentDate, User user, Show show) {
        this.id = id;
        this.content = content;
        this.commentDate = commentDate;
        this.user = user;
        this.show = show;
    }
}

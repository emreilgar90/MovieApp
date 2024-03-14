package com.emreilgar.movieapp.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String time;
    private String days;

    public Schedule(Long id, String time, String days) {
        this.id = id;
        this.time = time;
        this.days = days;
    }
}

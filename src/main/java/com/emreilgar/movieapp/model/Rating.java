package com.emreilgar.movieapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double average;

    public Rating(Long id, double average) {
        this.id = id;
        this.average = average;
    }
}

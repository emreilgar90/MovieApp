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
public class Self {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String self;

    public Self(String self) {
        this.self = self;
    }
}

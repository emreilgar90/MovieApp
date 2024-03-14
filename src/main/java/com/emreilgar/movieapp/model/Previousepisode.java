package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
public class Previousepisode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String previousepisode;
    @OneToOne()
    private Links links;

    public Previousepisode(Long id, String previousepisode, Links links) {
        this.id = id;
        this.previousepisode = previousepisode;
        this.links = links;
    }
}

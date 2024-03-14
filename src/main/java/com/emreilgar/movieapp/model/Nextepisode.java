package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
public class Nextepisode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nextepisode;
    @OneToOne
    private Links links;

    public Nextepisode(Long id, String nextepisode, Links links) {
        this.id = id;
        this.nextepisode = nextepisode;
        this.links = links;
    }
}

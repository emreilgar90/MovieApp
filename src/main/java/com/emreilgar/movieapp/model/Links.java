package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
public class Links {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Self self;
    @OneToOne
    private Previousepisode previousepisode;
    @OneToOne
    private Nextepisode nextepisode;
    @OneToOne(mappedBy = "links")
    private Show show;

    public Links(Long id, Self self, Previousepisode previousepisode, Nextepisode nextepisode, Show show) {
        this.id = id;
        this.self = self;
        this.previousepisode = previousepisode;
        this.nextepisode = nextepisode;
        this.show = show;
    }
}

package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String code;
    private String timezone;

    @OneToOne
    private Network network;

    public Country(Long id, String name, String code, String timezone, Network network) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.timezone = timezone;
        this.network = network;
    }
}

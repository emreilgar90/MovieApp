package com.emreilgar.movieapp.model;

import com.emreilgar.movieapp.utility.data.CountryData;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@Entity
@Table(name = "network")
public class Network {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Country country;
    private String officialSite;

    @OneToOne(mappedBy = "network")
    private Show show;

    public Network(Long id, String name, Country country, String officialSite, Show show) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.officialSite = officialSite;
        this.show = show;
    }
}

package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@Builder
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


}

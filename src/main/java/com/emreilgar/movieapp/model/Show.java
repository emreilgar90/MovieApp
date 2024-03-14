package com.emreilgar.movieapp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@Builder
@Entity
@Table(name = "show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String url;
    private String name;
    private String language;
    @OneToOne(fetch = FetchType.LAZY)
    private Genre genres;
    private String status;
    private int runtime;
    private int averageRuntime;
    private String premiered;
    private String ended;
    private String officialSite;
    @OneToOne
    private Schedule schedule;
    private String rating;
    private int weight;
    private String type;
    @OneToOne(mappedBy = "show")
    private Network network;
    private String image;
    private String country;

    @Lob //Large object, büyük veriler tutulmak isteniyorsa.
    /**Bu anotasyon, ilgili alanın büyük veri türlerini temsil edeceğini belirtir ve
     * veritabanında bu alanın CLOB (Karakter Büyük Nesneler) veya BLOB (Binary Large Object)
     * türlerinde saklanmasını sağlar.**/
    private String summary;

    @OneToMany(mappedBy = "show")
    private List<ShowComment> comments;
    @OneToOne
    private Links links;


}

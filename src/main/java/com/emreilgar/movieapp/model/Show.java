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

    public Show(int id, String url, String name, String language, Genre genres, String status, int runtime, int averageRuntime, String premiered, String ended, String officialSite, Schedule schedule, String rating, int weight, String type, Network network, String image, String country, String summary, List<ShowComment> comments, Links links) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.language = language;
        this.genres = genres;
        this.status = status;
        this.runtime = runtime;
        this.averageRuntime = averageRuntime;
        this.premiered = premiered;
        this.ended = ended;
        this.officialSite = officialSite;
        this.schedule = schedule;
        this.rating = rating;
        this.weight = weight;
        this.type = type;
        this.network = network;
        this.image = image;
        this.country = country;
        this.summary = summary;
        this.comments = comments;
        this.links = links;
    }
}

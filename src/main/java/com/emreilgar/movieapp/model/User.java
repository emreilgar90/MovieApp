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
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String surname;
    @Column(length = 50)
    private String mail;
    @Column(length = 15)
    private String phone;
    @Column(length = 32)
    private String password;
    @Column(length = 50)
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Show> favShow;
    @Column(length = 50)
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Genre> favGenre;
    @OneToMany(mappedBy = "user")
    private List<ShowComment> comments;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private UserType userType=UserType.USER;

    public User(Long id, String name, String surname, String mail, String phone, String password, List<Show> favShow, List<Genre> favGenre, List<ShowComment> comments, UserType userType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
        this.password = password;
        this.favShow = favShow;
        this.favGenre = favGenre;
        this.comments = comments;
        this.userType = userType;
    }
}

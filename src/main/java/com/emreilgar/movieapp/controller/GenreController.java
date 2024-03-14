package com.emreilgar.movieapp.controller;

import com.emreilgar.movieapp.model.Genre;
import com.emreilgar.movieapp.model.User;
import com.emreilgar.movieapp.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genre")
@RequiredArgsConstructor

public class GenreController {
    private final GenreService genreService;

    @GetMapping("/findallgenre")
    public ResponseEntity<List<Genre>> findall(){
        return ResponseEntity.ok(genreService.findall());
    }
}

package com.emreilgar.movieapp.service;

import com.emreilgar.movieapp.model.Genre;
import com.emreilgar.movieapp.model.User;
import com.emreilgar.movieapp.repository.IGenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreService {
    private final IGenreRepository iGenreRepository;


    public List<Genre> createGenresWithName(List<String> genres) {
        List<Genre> genreList = new ArrayList<>();
        for(String name: genres){
            Optional<Genre> optionalGenre = iGenreRepository.findOptionalByName(name);
            if(optionalGenre.isPresent()){
                genreList.add(optionalGenre.get());
            } else {
                Genre newGenre = Genre.builder().name(name).build();
                iGenreRepository.save(newGenre);
                genreList.add(newGenre);
            }
        }
        return genreList;
    }



    public List<Genre> findall() {
        List<Genre> genreList=iGenreRepository.findAll();
        return genreList;
    }
}

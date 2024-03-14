package com.emreilgar.movieapp.utility.data;

import com.emreilgar.movieapp.model.Genre;
import com.emreilgar.movieapp.model.Show;
import com.emreilgar.movieapp.repository.IGenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
public class JsonJavaObject {
    private static final  String API_URL = "https://api.tvmaze.com/shows";
    private  final IGenreRepository genreRepository;


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public void getAllShow(){
        RestTemplate restTemplate = new RestTemplate();
        ShowData [] shows = restTemplate.getForObject(API_URL, ShowData[].class);

        for (ShowData show : shows) {
            Show show1 = new Show();
            show1.setId(show.getId());
            show1.setName(show.getName());
            show1.setUrl(show.getUrl());
            show1.setLanguage(show.getLanguage());
            //show1.setGenres(show.getGenres());
            show1.setRuntime(show.getRuntime());
            show1.setAverageRuntime(show.getAverageRuntime());
            show1.setPremiered(show.getPremiered());
            show1.setEnded(show.getEnded());
            show1.setOfficialSite(show.getOfficialSite());
            show1.setStatus(show.getStatus());

        }
    }


}

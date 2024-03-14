package com.emreilgar.movieapp.service;

import com.emreilgar.movieapp.model.Show;
import com.emreilgar.movieapp.model.User;
import com.emreilgar.movieapp.repository.IShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService {
    private final IShowRepository iShowRepository;


    public Show save(Show show){
        return iShowRepository.save(show);
    }

    public List<Show> findall() {
        List<Show> showList = iShowRepository.findAll();
        return showList;
    }
}

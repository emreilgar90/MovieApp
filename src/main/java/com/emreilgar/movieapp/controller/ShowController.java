package com.emreilgar.movieapp.controller;

import com.emreilgar.movieapp.model.Show;
import com.emreilgar.movieapp.model.User;
import com.emreilgar.movieapp.service.ShowService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/show")
@RequiredArgsConstructor
public class ShowController {
    private final ShowService showService;

    @GetMapping("/findallshow")
    public ResponseEntity<List<Show>> findall(){
        return ResponseEntity.ok(showService.findall());
    }

}

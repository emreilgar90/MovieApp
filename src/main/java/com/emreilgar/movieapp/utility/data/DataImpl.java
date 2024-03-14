package com.emreilgar.movieapp.utility.data;

import com.emreilgar.movieapp.service.GenreService;
import com.emreilgar.movieapp.service.ShowService;
import com.emreilgar.movieapp.service.UserService;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
@RequiredArgsConstructor
public class DataImpl implements ApplicationRunner {
    private final ShowService showService;
    private final UserService userService;
    private final GenreService genreService;
    private static final  String API_URL = "https://api.tvmaze.com/shows";

    @Override
    public void run(ApplicationArguments args) throws Exception {
        getAllShows();

    }

    public void getAllShows(){
        try {
            URL url= new URL(API_URL);
            HttpURLConnection hr= (HttpURLConnection)url.openConnection();
            InputStream inputStream= hr.getInputStream();
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
            String value="";
            value= bufferedReader.readLine();


            ShowData [] shows =new Gson().fromJson(value,ShowData[].class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

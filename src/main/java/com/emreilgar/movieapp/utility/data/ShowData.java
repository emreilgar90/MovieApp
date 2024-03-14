package com.emreilgar.movieapp.utility.data;

import lombok.*;

import java.util.List;
@Data
@RequiredArgsConstructor
public class ShowData {
    private int id;
    private String url;
    private String name;
    private String language;
    private List<String> genres;
    private String status;
    private int runtime;
    private int averageRuntime;
    private String premiered;
    private String ended;
    private String officialSite;
    private ScheduleData scheduleData;
    private RatingData ratingData;
    private int weight;
    private NetworkData networkData;
    private Object webChannel;
    private Object dvdCountry;
    private ExternalsData externalsData;


}



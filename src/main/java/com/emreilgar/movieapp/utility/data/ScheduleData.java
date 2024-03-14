package com.emreilgar.movieapp.utility.data;

import lombok.*;

import java.util.List;
@Data
@RequiredArgsConstructor
public class ScheduleData {
    private String time;
    private List<String> days;
}
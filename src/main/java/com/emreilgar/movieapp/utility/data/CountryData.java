package com.emreilgar.movieapp.utility.data;

import lombok.*;

@Data
@RequiredArgsConstructor
public class CountryData {
    private String name;
    private String code;
    private String timezone;
}
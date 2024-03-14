package com.emreilgar.movieapp.utility.data;

import lombok.*;
@Data
@RequiredArgsConstructor
public class NetworkData {
    private int id;
    private String name;
    private CountryData countryData;
    private String officialSite;
}

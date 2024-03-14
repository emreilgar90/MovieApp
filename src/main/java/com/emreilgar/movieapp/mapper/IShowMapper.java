package com.emreilgar.movieapp.mapper;

import com.emreilgar.movieapp.model.Show;
import com.emreilgar.movieapp.utility.data.ShowData;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;



@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IShowMapper {
    IShowMapper INSTANCE = Mappers.getMapper(IShowMapper.class);



}
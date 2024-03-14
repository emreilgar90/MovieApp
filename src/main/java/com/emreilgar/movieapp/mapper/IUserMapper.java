package com.emreilgar.movieapp.mapper;

import com.emreilgar.movieapp.dto.UserCreateRequestDto;
import com.emreilgar.movieapp.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    User toUserCreate(final UserCreateRequestDto userCreateRequestDto);



}

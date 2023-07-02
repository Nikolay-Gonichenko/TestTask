package com.example.lanittesttask.mapper;

import com.example.lanittesttask.dto.TitleDto;
import com.example.lanittesttask.model.Title;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TitleMapper {

    TitleDto titleToDto(Title title);
}

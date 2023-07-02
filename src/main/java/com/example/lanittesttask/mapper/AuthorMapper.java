package com.example.lanittesttask.mapper;

import com.example.lanittesttask.dto.AuthorDto;

import com.example.lanittesttask.model.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PositionMapper.class})
public interface AuthorMapper {

    AuthorDto authorToDto(Author author);
}

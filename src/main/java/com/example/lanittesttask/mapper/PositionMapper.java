package com.example.lanittesttask.mapper;

import com.example.lanittesttask.dto.PositionDto;
import com.example.lanittesttask.model.Position;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PositionMapper {

    PositionDto positionToDto(Position position);
}

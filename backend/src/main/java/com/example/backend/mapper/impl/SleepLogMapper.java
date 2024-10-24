package com.example.backend.mapper.impl;

import com.example.backend.dto.SleepLogDto;
import com.example.backend.mapper.Mapper;
import com.example.backend.model.SleepLogEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SleepLogMapper implements Mapper<SleepLogEntity, SleepLogDto> {
    private final ModelMapper modelMapper;

    public SleepLogMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public SleepLogDto mapTo(SleepLogEntity sleepLogEntity) {
        return modelMapper.map(sleepLogEntity, SleepLogDto.class);
    }

    @Override
    public SleepLogEntity mapFrom(SleepLogDto sleepLogDto) {
        return modelMapper.map(sleepLogDto, SleepLogEntity.class);
    }
}

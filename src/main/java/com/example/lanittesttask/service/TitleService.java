package com.example.lanittesttask.service;


import com.example.lanittesttask.dto.TitleDto;
import com.example.lanittesttask.exception.NoSuchTitleException;
import com.example.lanittesttask.mapper.TitleMapper;
import com.example.lanittesttask.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;

    @Autowired
    private TitleMapper titleMapper;

    public TitleDto getTitleById(String id) {
        return titleMapper.titleToDto(titleRepository.findById(id)
                .orElseThrow(() -> new NoSuchTitleException("Нет заголовка с таким ID")));
    }
}

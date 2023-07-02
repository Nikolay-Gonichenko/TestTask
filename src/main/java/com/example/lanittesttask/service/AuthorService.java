package com.example.lanittesttask.service;

import com.example.lanittesttask.dto.AuthorDto;
import com.example.lanittesttask.exception.NoSuchAuthorException;
import com.example.lanittesttask.mapper.AuthorMapper;
import com.example.lanittesttask.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    public AuthorDto getAuthorById(String id) {
        return authorMapper.authorToDto(authorRepository.findById(id)
        .orElseThrow(() -> new NoSuchAuthorException("Нет автора с таким ID")));
    }
}

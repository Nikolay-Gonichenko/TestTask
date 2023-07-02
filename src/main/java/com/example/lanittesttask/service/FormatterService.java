package com.example.lanittesttask.service;

import com.example.lanittesttask.dto.AuthorDto;
import com.example.lanittesttask.dto.TitleDto;
import com.example.lanittesttask.dto.request.RequestEmail;
import com.example.lanittesttask.util.ParagraphsUtil;
import com.example.lanittesttask.util.PhoneUtil;
import com.example.lanittesttask.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class FormatterService {

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Autowired
    private TitleService titleService;

    @Autowired
    private AuthorService authorService;


    public String format(RequestEmail requestEmail) {
        TitleDto titleDto = titleService.getTitleById(requestEmail.getRace().getValue());
        List<AuthorDto> authors = new ArrayList<>();
        requestEmail.getAuthors().forEach( author ->
                authors.add(authorService.getAuthorById(author.getAuthorId().getValue()))
        );

        Context context = new Context();

        context.setVariable("description", titleDto.getDescription());
        context.setVariable("theme", titleDto.getTheme());
        context.setVariable("code", titleDto.getCode());
        context.setVariable("timeCreated", TimeUtil.convertDate(requestEmail.getCreated().getDateTime()));
        context.setVariable("id", requestEmail.getUid().getCode().getValue());
        context.setVariable("authors", authors);
        context.setVariable("paragraphs",
                ParagraphsUtil.convertTextToParagraphs(requestEmail.getDocument().getText(),
                        requestEmail.getRace().getValue()));
        context.setVariable("telephone", PhoneUtil.convertPhone(requestEmail.getDocument().getPhone().getValue()));
        context.setVariable("address", requestEmail.getDocument().getAddress().getValue());
        context.setVariable("sent_time", TimeUtil.getCurrentTime());

        return springTemplateEngine.process("output", context);
    }
}

package com.example.lanittesttask.controller;

import com.example.lanittesttask.dto.request.RequestEmail;
import com.example.lanittesttask.service.FormatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/format")
public class FormatController {

    @Autowired
    private FormatterService formatterService;

    @PostMapping(value = "", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public String format(@RequestBody RequestEmail requestEmail) {
        return formatterService.format(requestEmail);
    }

    @GetMapping(value = "/test")
    public ResponseEntity<String> test(@RequestParam("id") Long id) {
        return ResponseEntity.ok("adada");
    }
}

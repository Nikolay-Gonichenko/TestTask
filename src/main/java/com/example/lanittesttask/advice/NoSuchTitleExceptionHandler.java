package com.example.lanittesttask.advice;

import com.example.lanittesttask.exception.NoSuchTitleException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class NoSuchTitleExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {NoSuchTitleException.class})
    private ResponseEntity<Object> handle(NoSuchTitleException exception, WebRequest request) {
        return handleExceptionInternal(exception, exception.getMessage(),
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}

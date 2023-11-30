package com.uol.host.backend.controller.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

import static com.uol.host.backend.constants.Constants.LISTA_NAO_POSSUI_USUARIOS_DISPONIVEIS;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception) {
        ExceptionDto dto = new ExceptionDto(LISTA_NAO_POSSUI_USUARIOS_DISPONIVEIS, "400");
        return ResponseEntity.badRequest().body(dto);
    }
}

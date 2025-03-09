package com.code.food.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HttpErrorExceptionHandler {

    private ResponseEntity<ApiError> buildErrorResponse(HttpStatus statusCode, String message) {
        var error = new ApiError(statusCode.value(), message, LocalDateTime.now());
        return ResponseEntity.status(statusCode).body(error);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ApiError> badRequest(BadRequestException badRequestException) {
        return buildErrorResponse(HttpStatus.BAD_REQUEST, badRequestException.getMessage());
    }

    //TODO: Criar tratamento de erro para usuários não encontrados, esse tratamento vai ser para o 404 NotFoundException
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiError> notFound(NotFoundException notFoundException) {
        return buildErrorResponse(HttpStatus.NOT_FOUND, notFoundException.getMessage());
    }

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<ApiError> forbidden(ForbiddenException forbiddenException) {
        return buildErrorResponse(HttpStatus.FORBIDDEN, forbiddenException.getMessage());
    }
}

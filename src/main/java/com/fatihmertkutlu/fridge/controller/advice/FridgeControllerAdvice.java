package com.fatihmertkutlu.fridge.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.fatihmertkutlu.fridge.dto.ErrorResponse;
import com.fatihmertkutlu.fridge.exception.NoItemFoundException;


@ControllerAdvice
public class FridgeControllerAdvice {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> globalException(Exception exception) {
        return ResponseEntity.unprocessableEntity().body(new ErrorResponse("serverError", "Internal server error"));
    }

    @ExceptionHandler(NoItemFoundException.class)
    public ResponseEntity<ErrorResponse> noItemFound(NoItemFoundException exception) {

        return ResponseEntity.ok(new ErrorResponse(exception.getErrorCode(), exception.getMessage()));

    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> mismatch(MethodArgumentTypeMismatchException exception) {

        return ResponseEntity.badRequest()
                .body(new ErrorResponse(exception.getErrorCode(), exception.getLocalizedMessage()));

    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Courier.Exceptions;

import Courier.Utilities.Apierror;
import java.util.Date;
import javax.validation.ConstraintViolationException;
import javax.validation.UnexpectedTypeException;
import javax.xml.bind.DataBindingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.web.firewall.RequestRejectedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Chahir Chalouati
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Apierror> dataIntegrityViolationException(DataIntegrityViolationException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.CONFLICT), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DataBindingException.class)
    public ResponseEntity<Apierror> dataBindingException(DataBindingException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidDataAccessApiUsageException.class)
    public ResponseEntity<Apierror> invalidDataAccessApiUsageException(InvalidDataAccessApiUsageException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Apierror> numberFormatException(NumberFormatException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Apierror> httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RequestRejectedException.class)
    public ResponseEntity<Apierror> requestRejectedException(RequestRejectedException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Apierror> httpMessageNotReadableException(HttpMessageNotReadableException e) {

        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Apierror> methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotWritableException.class)
    public ResponseEntity<Apierror> methodArgumentNotValidException(HttpMessageNotWritableException e) {
        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageConversionException.class)
    public ResponseEntity<Apierror> httpMessageConversionException(HttpMessageConversionException e) {
        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.BAD_REQUEST), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Apierror> ConstraintViolationException(ConstraintViolationException e) {
        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnexpectedTypeException.class)
    public ResponseEntity<Apierror> unexpectedTypeException(UnexpectedTypeException e) {
        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<Apierror> badCredentialsException(BadCredentialsException e) {
        return new ResponseEntity<>(new Apierror(e.getLocalizedMessage(), new Date(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

}

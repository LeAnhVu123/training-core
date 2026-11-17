package com.study.core.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class HandleExceptionController {

  @ExceptionHandler
  public void  handleException(Exception e) {
    log.error(e.getMessage(), e);
  }
}

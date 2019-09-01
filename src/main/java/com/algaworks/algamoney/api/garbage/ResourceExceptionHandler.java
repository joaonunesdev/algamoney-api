//package com.algaworks.algamoneyapi.exception;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
//import org.springframework.context.i18n.LocaleContextHolder;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//import java.util.List;
//
//@ControllerAdvice
//public class ResourceExceptionHandler {
//
//    @Autowired
//    private MessageSource messageSource;
//
//    @ExceptionHandler(value = MethodArgumentNotValidException.class)
//    public ResponseEntity<List<Erro2>> validation(MethodArgumentNotValidException e, HttpServletRequest request) {
//
//        List<Erro2> erros = new ArrayList<Erro2>();
//
//        //ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(), "Validation Error", System.currentTimeMillis());
//
//        for (FieldError x : e.getBindingResult().getFieldErrors()) {
//            String mensagemUsuario = messageSource.getMessage(x, LocaleContextHolder.getLocale());
//            String mensagemDesenvolvedor = x.toString();
//            Erro2 err = new Erro2(mensagemUsuario, mensagemDesenvolvedor);
//            erros.add(err);
//            //err.addError(x.getField(), x.getDefaultMessage());
//        }
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);
//    }
//
//
//
//}

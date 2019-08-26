package com.algaworks.algamoneyapi.garbage;

//@ControllerAdvice
//public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
//
//    @Autowired
//    private MessageSource messageSource;
//
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        List<String> errors = new ArrayList<String>();
//        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
//            //errors.add(error.getField() + ": " + error.getDefaultMessage());
//            //String mensagemUsuario = messageSource.getMessage(error, LocaleContextHolder.getLocale());
//            String x = messageSource.getMessage(error, LocaleContextHolder.getLocale());
//            errors.add(error.getField() + ": " + messageSource.getMessage(error, LocaleContextHolder.getLocale()));
//        }
//        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
//            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
//        }
//
//        ApiError apiError =
//                new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
//        return handleExceptionInternal(
//                ex, apiError, headers, apiError.getStatus(), request);
//    }
//}

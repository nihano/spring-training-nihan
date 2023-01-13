package com.cydeo.aspect;

import com.cydeo.dto.CourseDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    //to put some information in console
    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

//    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..))")
//    public void myPointcut(){}
//
//    @Before("myPointcut()")
//    public void log(){
//        logger.info("Info log.........");
//    }

//    //we can also give pointcut expression in advice, but it will only be valid for this method
//    @Before("execution(* com.cydeo.controller.CourseController.*(..))")
//    public void log(){
//        logger.info("Info log.........");
//    }
//
//    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
//    public void courseRepositoryFindByIdPc() {
//    }
//
//    @Before("courseRepositoryFindByIdPc()")
//    public void beforeCourseRepositoryFindById(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//
//    @Pointcut("within(com.cydeo.controller..*)")
//    //any method/anything inside controller package and if controller package has any subpackages
//    public void anyControllerOperation() {}
//
//    @Pointcut("@within(org.springframework.stereotype.Service)")
//    public void anyServiceOperation() {}
//
//    @Before("anyControllerOperation() || anyServiceOperation()")
//    public void beforeControllerOrServiceAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
//    public void anyDeleteControllerOperation(){}
//
//    @Before("anyDeleteControllerOperation()")
//    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//  }
//    @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
//    public void loggingAnnotationPC(){}
//
//    @Before("loggingAnnotationPC()")
//    public void beforeLoggingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
//                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }

//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    public void afterReturningGetMappingAnnotation(){}

//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "result")
//    public void afterReturningGetMappingOperation(JoinPoint joinPoint, Object result){
//        logger.info("After Returning -> Method: {}, Result: {}", joinPoint.getSignature(), result.toString());
//    }

    //CourseDTO -> Object this is ok
    //List<CourseDTO>-> List<Object> this is not ok because of generics
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "results")
//    public void afterReturningGetMappingOperation(JoinPoint joinPoint, List<CourseDTO> results){
//        logger.info("After Returning -> Method: {}, Results: {}", joinPoint.getSignature(), results.toString());
//    }
//
//    @AfterThrowing(pointcut = "afterReturningGetMappingAnnotation()", throwing = "exception")
//    public void afterThrowingException(JoinPoint joinPoint, RuntimeException exception){
//        logger.error("After Throwing -> Method: {}, Exception: {}"
//        , joinPoint.getSignature().toShortString(), exception.getMessage());
//    }






}

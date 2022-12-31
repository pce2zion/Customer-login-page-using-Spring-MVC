package com.example.threelayercodestarter.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//THIS labels the validation class
@Target({ElementType.METHOD, ElementType.FIELD})
//this basically tells what the annotation will be used for weather for methods or fields
@Retention(RetentionPolicy.RUNTIME)
//this states how long the marked annotation will be stored or used(mostly at run time)
public @interface CourseCode {
   public String value()  default "LUV";
//   just like in validation annotations ; you have message, value and you input their own custom value in them, you
//    could also give an input default value of a string or number

   public String message() default "must start with LUV";
//   same as above

   public Class <?>[] groups() default {};

   public Class<? extends Payload>[] payload() default {};
}

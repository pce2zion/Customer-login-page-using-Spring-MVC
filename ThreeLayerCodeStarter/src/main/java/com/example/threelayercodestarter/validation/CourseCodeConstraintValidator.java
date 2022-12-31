package com.example.threelayercodestarter.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private  String coursePrefix;
    @Override
    public void initialize(CourseCode theCourseCOde) {
      coursePrefix = theCourseCOde.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result ;
        if(theCode != null){
            result = theCode.startsWith(coursePrefix);
        }
        else {
            result = true;
        }
        result = theCode.startsWith(coursePrefix);
        return result;
    }
}

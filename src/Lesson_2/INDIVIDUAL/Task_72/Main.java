package Lesson_2.INDIVIDUAL.Task_72;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        MethodsAcademy methodsAcademy = new MethodsAcademy();
        Method[] methods = methodsAcademy.getClass().getMethods();
        for (Method m:methods) {
            if ((m.getName()).contains("method")) {
                System.out.println(m.getName() + ": " + m.getAnnotation(AcademyInfo.class));
            }
        }


    }
}

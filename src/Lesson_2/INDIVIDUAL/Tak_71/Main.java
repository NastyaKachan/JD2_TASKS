package Lesson_2.INDIVIDUAL.Tak_71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloWorld helloWorld = new HelloWorld();

        Method method = helloWorld.getClass().getDeclaredMethod("printHelloWorld");
        method.setAccessible(true);
        method.invoke(helloWorld);
    }
}

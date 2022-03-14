package Lesson_2.INDIVIDUAL.Task_70;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Man man = new Man();

        Method method = man.getClass().getDeclaredMethod("printInfoMan");
        method.setAccessible(true);
        method.invoke(man);

    }
}

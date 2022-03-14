package Lesson_2.INDIVIDUAL.Task_72;

public class MethodsAcademy {

    @AcademyInfo(year = 2222)
    public static void methodWithAnnotation(){
        System.out.println("This method is marked annotation @AcademyInfo");
    }

    public static void methodWithoutAnnotation(){
        System.out.println("This method without annotation @AcademyInfo");

    }
}

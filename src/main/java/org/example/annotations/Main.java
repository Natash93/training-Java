package org.example.annotations;

public class Main {
    public static void main(String[] args) {
        java.lang.reflect.Field[] fields = Student.class.getDeclaredFields();

        for (java.lang.reflect.Field field : fields) {
            boolean isAnnotated = field.isAnnotationPresent(Field.class);
            System.out.println("Field '" + field.getName() + "' annotated: " + isAnnotated);
        }
    }
}

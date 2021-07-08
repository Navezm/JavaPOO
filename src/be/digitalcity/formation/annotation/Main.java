package be.digitalcity.formation.annotation;

import be.digitalcity.formation.files.Voiture;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Class<?> clazz = Voiture.class;
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Logging.class)) {
                System.out.println(m.getName() + " possède l'annotation");
                Annotation a = m.getAnnotation(Logging.class);
                System.out.println(((Logging)a).value());
            }
        }
    }

}

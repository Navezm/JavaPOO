package be.digitalcity.formation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD}) // Spécifie sur quoi on va pouvoir utiliser cette annotation

public @interface Logging {
    String value() default "DEFAULT";
}

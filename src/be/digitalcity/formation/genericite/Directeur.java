package be.digitalcity.formation.genericite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

public class Directeur<T extends Personnel> extends Personnel {

    private T assistant;

    public T getAssistant() {
        return assistant;
    }

    public void setAssistant(Class<T> typeAssistant, String nomAssistant) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<T> ctor = typeAssistant.getConstructor(String.class);
        this.assistant = ctor.newInstance(nomAssistant);
    }

    public void afficher(){
        System.out.println(assistant);
    }

}

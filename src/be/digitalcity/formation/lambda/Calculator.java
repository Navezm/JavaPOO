package be.digitalcity.formation.lambda;

@FunctionalInterface // Permet de dire que c'est une interface qui ne va contenir qu'une seule signature (si on rajoute on va avoir une erreur)
public interface Calculator {
    void effectuerOperation(int[] data);
}

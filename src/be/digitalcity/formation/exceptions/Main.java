package be.digitalcity.formation.exceptions;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            genereErreur();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exceptions :");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Code");
    }

    public static void genereErreur() throws NullPointerException { // Throws -> signifie que la méthode est susceptible de générer une erreur
        throw new NullPointerException(); // Throw -> Lance une nouvelle exception
    }

}

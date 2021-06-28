package be.digitalcity.formation.lambda;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    public static int[] tableau = new int[]{1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
//        calculer(tableau -> {
//            for (int j : tableau) {
//                System.out.println(j);
//            }
//        });
//        calculer(tableau -> {
//            System.out.println(Arrays.stream(tableau).average());
//        });
//
//        String msg = "Bonjour";
//        testConsumer(data -> System.out.println(data), msg);
//        testConsumer(data -> {
//            data += " les amis";
//            System.out.println(data);
//        },msg);
        testStreams();
    }

    public static void calculer(Calculator fct) {
        System.out.println("Début de l'instructio");
        fct.effectuerOperation(tableau);
    }

    public static void testConsumer(Consumer<String> consumer, String data) {
        if (data != null) {
            consumer.accept(data);
        } else {
            throw new NullPointerException("Data is null");
        }
    }

    public static void testStreams() {
        System.out.println(Arrays.stream(tableau)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .reduce((a,b) -> a + b));
//                .forEach(i -> System.out.println(i));
    }
}

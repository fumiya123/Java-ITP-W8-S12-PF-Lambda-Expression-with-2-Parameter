import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // membuat lambda expression dengan dua parameter a dan b
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // lambda expression untuk menjumlahkan dua bilangan
        int result = add.apply(10, 20);

        // print hasil
        System.out.println("Hasil penjumlahan: " + result);
    }
}

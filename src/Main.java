public class Main {
        static void main() {
        IO.println(String.format("Hello and welcome!"));
            System.out.println("Hello and welcome ");
            System.out.println("println desde master");
        for (int i = 1; i <= 5; i++) {
            IO.println("i = " + i);
        }
        if (true){// nunca poner if true
            System.out.println("Hello desde develop");
        }
    }
}

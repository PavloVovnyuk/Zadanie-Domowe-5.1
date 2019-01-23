import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator ();
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Wpisz 1 znaczenie ");
        int firstNum = scanner.nextInt ();
        scanner.nextLine ();
        System.out.println ("wpisz 2 znaczenie");
        int secondNum = scanner.nextInt ();
        System.out.println (" Wynik");
        scanner.close ();
        int calcResult = calculator.calk (firstNum, secondNum);
        System.out.println (calcResult);
    }
}


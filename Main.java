import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        List<Integer> dividers = new ArrayList<>();

        while (dividers.isEmpty()) {
            System.out.println("Podaj liczbę całkowitą dodatnią:");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();

            if(0 < userNumber) {
                for(var i = 2; i <= userNumber; i++){
                    if(userNumber % i == 0) {
                        dividers.add(i);
                    }
                }
            } else {
                System.out.println("Podaj poprawną liczbę");
                continue;
            }

            if(dividers.size() != 1) {
                System.out.println("Dzielniki liczby " + userNumber + " to: " + dividers);
            } else {
                System.out.println("Liczba " + userNumber + " jest liczbą pierwszą i dzieli się wyłącznie przez samą siebie.");
            }
        }
    }
}

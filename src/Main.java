import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number, comp = 0;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        number = scanner.nextInt();

        i = 1;
        while (i < number){
            if (number % i == 0)
                comp += i;
            i++;
        }
        if (comp == number)
            System.out.println(number + " Mükemmel sayıdır.");
        else
            System.out.println(number + " Mükemmel sayı değildir.");
    }
}
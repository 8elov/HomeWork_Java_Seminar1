import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class App_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        int triangular_number = 0;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            triangular_number += i;
            factorial *= i;
        }
        iScanner.close(); 
        System.out.println("Треугольное число: " + triangular_number);
        System.out.println("Факториал: " + factorial);
    }
}
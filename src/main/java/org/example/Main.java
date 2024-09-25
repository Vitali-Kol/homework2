package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Введите именно ТРЕХЗНАЧНОЕ число");
            return;
        }
        int edinici = number % 10;
        int desyatki = (number / 10) % 10;
        int sotki = (number / 100) % 10;

        System.out.println("Количество единиц " + edinici);
        System.out.println("Количество десяток " + desyatki);
        System.out.println("Количество соток " + sotki);
        System.out.println("Сумма всех цифр " + (edinici + desyatki + sotki));
    }
}
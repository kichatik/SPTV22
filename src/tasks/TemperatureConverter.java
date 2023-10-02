/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TemperatureConverter {
    private final Scanner scanner;
    
    public TemperatureConverter(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void doConvert() {
        boolean repeat = true;
        do{
            System.out.println("Выберите направление конверсии:");
            System.out.println("0. Закончить задачу");
            System.out.println("1. Конвертировать из цельсия в фарингейт");
            System.out.println("2. Конвертировать из фарингейт в цельсия");
            System.out.print("Задача №: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из конвертера");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана конверсия из цельсия в фаренгейт");
                    celsiusToFarenheit();
                    break;
                case 2:
                    System.out.println("Выбрана конверсия из фаренгейта в цельсию");
                    farenheitToCelsium();
                    break;
                default:
                    System.out.println("Выберите числа из списка");
            }
            System.out.println("-------------------");
        }while(repeat);
    }

    private void celsiusToFarenheit() {
        System.out.print("Введите температуру (Celsium): ");
        double tCelsium = scanner.nextDouble(); scanner.nextLine();
        double tFahrenheit = (tCelsium * 9/5) + 32;
        System.out.printf("Результат (Fahrenheit): %.1f%n", tFahrenheit);
    }

    private void farenheitToCelsium() {
        System.out.print("Введите температуру (Fahrenheit): ");
        double tFahrenheit = scanner.nextDouble(); scanner.nextLine();
        double tCelsium = (tFahrenheit - 32) * 5/9;
        System.out.printf("Результат (Celsium): %.1f%n", tCelsium);
    }
}

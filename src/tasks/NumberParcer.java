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
public class NumberParcer {
    private final Scanner scanner;

    public NumberParcer(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        System.out.println("Введите трёхзначное число");
        int number = scanner.nextInt(); scanner.nextLine();
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;
        int sum = ones + tens + hundreds;
        
        System.out.println("В этом числе");
        System.out.printf(" - единиц:  %d\n", ones);
        System.out.printf(" - десятков:  %d\n", tens);
        System.out.printf(" - сотни:  %d\n", hundreds);
        System.out.printf(" - сумма цифр:  %d\n", sum);
        System.out.println("");
    }
    
}

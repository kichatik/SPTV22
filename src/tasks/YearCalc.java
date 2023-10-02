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
public class YearCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер года (например, 1984): ");
        int year = scanner.nextInt();
        scanner.close();

        String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
        String[] animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", 
                            "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"};

        int startYear = 1984; 
        int cycleLength = 60;  

        int yearIndex = (year - startYear) % cycleLength;

        String color = colors[yearIndex / 12];
        String animal = animals[yearIndex % 12];

        System.out.println("Год " + color + " " + animal);
    }
}


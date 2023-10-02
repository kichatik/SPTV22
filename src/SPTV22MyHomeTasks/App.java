/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SPTV22MyHomeTasks;
import tasks.NumberParcer;
import java.util.Scanner;
import tasks.TemperatureConverter;
/**
 *
 * @author admin
 */
public class App {
    private final Scanner scanner;
    
    public App() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Парсер числа");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("");
                    NumberParcer numberParcer;
                    numberParcer = new NumberParcer(scanner);
                    numberParcer.doParse();
                    break;
                default:
                    break;
                
            }
        }while(repeat);
        System.out.println("До свидания!");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Ball;
import java.util.Scanner;

public class BallManager {

    private final Scanner scanner;
    
    public BallManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public Ball addBall() {
        System.out.println("-----Add ball-----");
        Ball ball = new Ball();
        System.out.println("Enter ball name: ");
        ball.setName(scanner.nextLine());
        System.out.println("Enter cost for 1 ball: ");
        ball.setCost(scanner.nextDouble());
        System.out.println("Added enemy: " + ball.toString());
        return ball;
    }

    public void printBallCost(Ball[] ball) {
        System.out.println("----- Balls Costs -----");
        for (int i = 0; i < ball.length; i++) {
            System.out.println("Ball: " + ball[i].getName() + " | Cost per ball: " + ball[i].getCost() + " Euro");
        }
    }   
    
    public void printListBall(Ball[] ball) {
        System.out.println("----- Ball list -----");
        for (int i = 0; i < ball.length; i++) {
            System.out.println("Ball name: " + ball[i].getName() + " Cost: " + ball[i].getCost() + " Euro");
        }
    }
    
}

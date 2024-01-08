package SPTV22ballshop;

import managers.PurchaseManager;
import managers.BuyerManager;
import managers.BallManager;
import entity.Purchase;
import entity.Buyer;
import entity.Ball;
import entity.User;
import java.util.Arrays;
import java.util.Scanner;


class App {
    private Scanner scanner = new Scanner(System.in);
    private Ball[] balls;
    private final BallManager ballManager;
    private final BuyerManager buyerManager;
    private final PurchaseManager purchaseManager;
    private Buyer[] buyers;
    private Purchase[] purchases;
    private User currentUser;  // Added to keep track of the logged-in user

    public App() {
        this.scanner = new Scanner(System.in);
        this.balls = new Ball[0];
        this.ballManager = new BallManager(scanner);
        this.buyerManager = new BuyerManager(scanner);
        this.purchaseManager = new PurchaseManager(scanner, buyerManager, ballManager);
        this.buyers = new Buyer[0];
        this.purchases = new Purchase[0];
        this.currentUser = null;
    }

    private void login() {
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        if ("anzhelika".equals(username) && "kichatova".equals(password)) {
            System.out.println("Login successful!");
            currentUser = new User(username, password);
        } else {
            System.out.println("Login failed. Invalid credentials.");
            currentUser = null;
        }
    }

    private boolean isLoggedIn() {
        return currentUser != null;
    }

    void run() {
        login();
        if (!isLoggedIn()) {
            System.out.println("Exiting the application. Login failed.");
            return;
        }

        boolean repeat = true;
        System.out.println("----- Balls Shop -----");
        do {
            System.out.println("List tasks");
            System.out.println("0. Exit");
            System.out.println("1. Add new product");
            System.out.println("2. Add new client");
            System.out.println("3. Product sell");
            System.out.println("4. Show all products");
            System.out.println("5. Show all clients");
            System.out.println("6. Add money to clients account");
            System.out.println("7. How many times the product was sold");
            System.out.println("8. Who bought for a large amount");
            System.out.println("9. All time purchases");
            System.out.println("Enter task number: ");
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    this.balls = Arrays.copyOf(this.balls, this.balls.length+1);
                    this.balls[this.balls.length - 1] = ballManager.addBall();
                    break;
                case 2:
                    this.buyers = Arrays.copyOf(this.buyers, this.buyers.length + 1);
                    this.buyers[this.buyers.length - 1] = buyerManager.addBuyer();
                    break;
                case 3:
                    this.purchases = Arrays.copyOf(this.purchases, this.purchases.length + 1);
                    this.purchases[this.purchases.length - 1] = purchaseManager.buyBall(balls, buyers);
                    break;
                case 4:
                    ballManager.printListBall(this.balls);
                    break;
                case 5:
                    buyerManager.printListBuyer(buyers);
                    break;
                case 6:
                    buyerManager.increaseBalance(buyers);
                    break;
                case 7:
                    purchaseManager.BoughtBall(purchases);
                    break;
                case 8:
                    purchaseManager.BiggestBuyers(purchases, buyers);
                    break;
                case 9:
                    purchaseManager.wholeIncome(purchases);
                    break;
                default:
                    System.out.println("Select task from list");
            }
        } while (repeat);
        
    }
}
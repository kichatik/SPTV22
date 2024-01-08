package managers;

import entity.Buyer;
import entity.Ball;
import entity.Purchase;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


public class PurchaseManager {

    private final Scanner scanner;
    private final BallManager ballManager;
    private final BuyerManager buyerManager;
    
    public PurchaseManager(Scanner scanner, BuyerManager buyerManager, BallManager ballManager) {
        this.scanner = scanner;
        this.ballManager = ballManager;
        this.buyerManager = buyerManager;
    }

    public Purchase buyBall(Ball[] balls, Buyer[] buyers) {
        Purchase purchase = new Purchase();
        ballManager.printBallCost(balls);
        System.out.print("Enter ball number from list:");
        int numberBall = scanner.nextInt(); scanner.nextLine();
        purchase.setBall(balls[numberBall - 1]);
        buyerManager.printListBuyer(buyers);
        System.out.print("Enter buyer number from list:");
        int numberBuyer = scanner.nextInt(); scanner.nextLine();
        purchase.setBuyer(buyers[numberBuyer - 1]);

        System.out.println("How many balls do you want to buy");
        int requestedCount = scanner.nextInt(); scanner.nextLine();
        double ballsPrice = requestedCount * balls[numberBall - 1].getCost();

        if (buyers[numberBuyer - 1].getBalance() >= ballsPrice) {
            double buyerBalance = buyers[numberBuyer - 1].getBalance() - ballsPrice;
            buyers[numberBuyer - 1].setBalance(buyerBalance);
            purchase.setCount(requestedCount);
            System.out.println("Buyer " + buyers[numberBuyer - 1].getFirstname() + " Bought " + requestedCount + " " + balls[numberBall - 1].getName() + " for " + ballsPrice + " Euro");
        } else {
            System.out.println("You don't have enough money");
        }
        return purchase;
}

    public void BoughtBall(Purchase[] purchases) {
        System.out.println("Bought Balls:");
        for (Purchase purchase : purchases) {
            Ball ball = purchase.getBall();
            int quantity = 0;
            quantity += purchase.getCount();

            System.out.println(quantity + " " + ball.getName() + " were bought.");
        }
    }

    public void BiggestBuyers(Purchase[] purchases, Buyer[] buyers) {
        double[] expensesArray = new double[buyers.length];
        Integer[] indexes = new Integer[buyers.length];

        for (int i = 0; i < buyers.length; i++) {
            double buyerExpenses = 0;

            for (Purchase purchase : purchases) {
                if (purchase.getBuyer().equals(buyers[i])) {
                    buyerExpenses += purchase.getCount() * purchase.getBall().getCost();
                }
            }

            expensesArray[i] = buyerExpenses;
            indexes[i] = i;
    }

    Arrays.sort(indexes, new ExpensesComparator(expensesArray));

    System.out.println("Buyers sorted by expenses (from highest to lowest):");
    for (int index : indexes) {
        Buyer currentBuyer = buyers[index];
        double expenses = expensesArray[index];
        System.out.println(currentBuyer.getFirstname() + " " + currentBuyer.getLastname() + " expenses: " + expenses + " Euro");
    }
}

    class ExpensesComparator implements Comparator<Integer> {
        private final double[] expensesArray;

        public ExpensesComparator(double[] expensesArray) {
            this.expensesArray = expensesArray;
        }

        @Override
        public int compare(Integer i1, Integer i2) {
            return Double.compare(expensesArray[i2], expensesArray[i1]);
        }
    }

    public void wholeIncome(Purchase[] purchases) {
        double totalIncome = 0;

        for (int i = 0; i < purchases.length; i++) {
            double purchaseCost = purchases[i].getCount() * purchases[i].getBall().getCost();
            totalIncome += purchaseCost;
        }

        System.out.println("Total income earned by the store: " + totalIncome + " Euro");
    }
    
}

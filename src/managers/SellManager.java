package managers;

import entity.Buyer;
import entity.Ball;
import entity.Purchase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SellManager {
    public List<Ball> loadBalls() {
        List<Ball> balls = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("balls");
            ois = new ObjectInputStream(fis);
            balls = (List<Ball>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File \"balls\" not found");
        } catch (IOException e) {
            System.out.println("I/O error while reading \"balls\"");
        } catch (ClassNotFoundException e) {
            System.out.println("Class \"Ball\" not found");
        }
        return balls;
    }

    public List<Buyer> loadBuyers() {
        List<Buyer> buyers = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("buyers");
            ois = new ObjectInputStream(fis);
            buyers = (List<Buyer>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File \"buyers\" not found");
        } catch (IOException e) {
            System.out.println("I/O error while reading \"buyers\"");
        } catch (ClassNotFoundException e) {
            System.out.println("Class \"Buyer\" not found");
        }
        return buyers;
    }

    public List<Purchase> loadPurchases() {
        List<Purchase> purchases = new ArrayList<>();
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("purchases");
            ois = new ObjectInputStream(fis);
            purchases = (List<Purchase>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File \"purchases\" not found");
        } catch (IOException e) {
            System.out.println("I/O error while reading \"purchases\"");
        } catch (ClassNotFoundException e) {
            System.out.println("Class \"Purchase\" not found");
        }
        return purchases;
    }
   
    public void saveBalls(List<Ball> balls) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("balls");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(balls);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File \"balls\" not found");
        } catch (IOException e) {
            System.out.println("I/O error while writing \"balls\"");
        }
    }
   
    public void saveBuyers(List<Buyer> buyers) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("buyers");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(buyers);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File \"buyers\" not found");
        } catch (IOException e) {
            System.out.println("I/O error while writing \"buyers\"");
        }
    }
   
    public void savePurchases(List<Purchase> purchases) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("purchases");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(purchases);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File \"buyers\" not found");
        } catch (IOException e) {
            System.out.println("I/O error while writing \"purchases\"");
        }
    }
}
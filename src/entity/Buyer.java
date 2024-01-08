/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author admin
 */
public class Buyer {
    private String firstname;
    private String lastname;
    private double balance;
    
    public Buyer() {
        
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.firstname);
        hash = 31 * hash + Objects.hashCode(this.lastname);
        hash = 31 * hash + Objects.hashCode(this.balance);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Buyer other = (Buyer) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.balance, other.balance)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Buyer{" 
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", balance=" + balance
                +'}';
    }
    
    
}

package entity;

import java.util.Objects;


public class Purchase {
    private Ball ball;
    private Buyer buyer;
    private int count;

    
    public Purchase() {
        
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ball);
        hash = 97 * hash + Objects.hashCode(this.buyer);
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
        final Purchase other = (Purchase) obj;
        if (!Objects.equals(this.ball, other.ball)) {
            return false;
        }
        if (!Objects.equals(this.buyer, other.buyer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Purchase{" 
                + "flower=" + ball.getName()
                + ", buyer=" + buyer.getFirstname()
                + ", " + buyer.getLastname()
                + ", cost=" + ball.getCost()
                + ", count=" + getCount()
                + '}';
    }

}
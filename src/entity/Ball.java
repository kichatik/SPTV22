package entity;
import java.util.Objects;

public class Ball {
    private String name;
    private double cost;
    
    public Ball() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        double hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.cost;;
        return (int) hash;
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
        final Ball other = (Ball) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Ball{" 
                + "name=" + name 
                + ", cost=" + cost
                + '}';
    }     
}

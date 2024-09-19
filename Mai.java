
class Vehicle {
    
    private int speed;

    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    public int getSpeed() {
        return speed;
    }
}


class Car extends Vehicle {
    
    public void setCarSpeed(int speed) {

        setSpeed(speed);
    }

    
    public int getCarSpeed() {
        
        return getSpeed();
    }
}


public class Mai {
    public static void main(String[] args) {

        Car myCar = new Car();
        
        
        myCar.setCarSpeed(100);
        
        
        System.out.println("The speed of the car is: " + myCar.getCarSpeed());
    }
}

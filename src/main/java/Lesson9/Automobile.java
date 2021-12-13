package Lesson9;

public abstract class Automobile {

     int maxSpeed;

    public Automobile(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

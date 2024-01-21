//Alejandro Quezada
//1/11/2024
//Module 1 Programming Assignment

public class ModuleOne {
    public static void main(String[] args) {
        moduleOne(args);
    }

    public static void moduleOne(String [] args) {
        Fan instanceOne = new Fan();
        System.out.println(instanceOne.toString());

        Fan instanceTwo = new Fan(Fan.MEDIUM, true, 4, "cyan");
        System.out.println(instanceTwo.toString());
    }
}

class Fan {
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = STOPPED;
    private boolean on = false;
    private int radius = 6;
    private String color = "white";

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean newOn){
        this.on = newOn;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String toString() {
        return "Fan { " + "speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "\"" + " }";
    }
}
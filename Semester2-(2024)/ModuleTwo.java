//Alejandro Quezada
//1/21/2024
//Module 2 Programming Assignment

class UseFans {
    Fan inst1 = new Fan(Fan.SLOW, true, 9, "yellow");
    Fan inst2 = new Fan(Fan.FAST, true, 2, "grey");
    Fan inst3 = new Fan(Fan.STOPPED, false, 8, "red");
    Fan inst4 = new Fan(Fan.SLOW, true, 5, "purple");

    public static void displayFans(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed() + ", Fan: " + fan.isOn() + ", Radius: " + fan.getRadius() + ", Color: " + fan.getColor());
    }

    public static void main2(String [] args) {
        UseFans useFans = new UseFans();

        displayFans(useFans.inst1);
    }
}

public class ModuleTwo{
    public static void main(String [] args) {
        System.out.println("Method Displaying Multiple Instances:");
        many(args);
        System.out.println("\nMethod Displaying a Single Instance");
        one(args);
        System.out.println("");
        System.out.println("Test Code");
        create(args);
    }
    public static void many(String [] args) {
        UseFans useFans = new UseFans();

        UseFans.displayFans(useFans.inst1);
        UseFans.displayFans(useFans.inst2);
        UseFans.displayFans(useFans.inst3);
        UseFans.displayFans(useFans.inst4);
    }
    public static void one(String [] args) {
        UseFans oneFan = new UseFans();

        UseFans.displayFans(oneFan.inst2);
    }
    public static void create(String [] args) {
        Fan test1 = new Fan(Fan.SLOW, true, 3, "brown");
        Fan test2 = new Fan(Fan.FAST, true, 1, "pink");

        UseFans.displayFans(test1);
        UseFans.displayFans(test2);
    }
}

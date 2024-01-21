//Alejandro Quezada
//1/21/2024
//Module 2 Programming Assignment

class UseFans {
    Fan inst1 = new Fan(Fan.SLOW, true, 9, "yellow");
    Fan inst2 = new Fan(Fan.FAST, true, 2, "grey");
    Fan inst3 = new Fan(Fan.STOPPED, false, 8, "red");
    Fan inst4 = new Fan(Fan.SLOW, true, 5, "purple");

    public static void displayFans(Fan fan){
        System.out.println(fan.getSpeed() + ", " + fan.isOn() + ", " + fan.getRadius() + ", " + fan.getColor());
    }

    public static void main(String [] args){
        UseFans useFans = new UseFans();

        displayFans(useFans.inst1);
        displayFans(useFans.inst2);
        displayFans(useFans.inst3);
        displayFans(useFans.inst4);
    }

    public static void main2(String [] args){
        UseFans useFans = new UseFans();

        displayFans(useFans.inst1);
    }
}

public class ModuleTwo{
    public static void main(String [] args){
    }
}

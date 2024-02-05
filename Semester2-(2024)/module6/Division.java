package module6;

//Alejandro Quezada
//2/4/2024
//Module 6 Programming Assignment

public abstract class Division {
    String divisName;
    String accNum;

    public Division(String divisName, String accNum) {
        this.divisName = divisName;
        this.accNum = accNum;
    }
    
    public abstract void display();
}

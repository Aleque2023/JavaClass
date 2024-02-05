package module6;

public class DomesticDivision extends Division{
    
    private String state;

    public DomesticDivision(String divisName, String accNum, String state) {
        super(divisName, accNum);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisName + "\nAccount Number: " + accNum + "\nState: " + state);
    }
}

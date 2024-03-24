package module6;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision ints1 = new InternationalDivision("Marketing", "1", "France", "French");
        InternationalDivision inst2 = new InternationalDivision("Manufacturing", "2", "Mexico", "Spanish");

        DomesticDivision inst3 = new DomesticDivision("Customer Support", "3", "Nebraska");
        DomesticDivision inst4 = new DomesticDivision("Research & Development", "4", "Washington");

        ints1.display();
        System.out.println("");
        inst2.display();
        System.out.println("");
        inst3.display();
        System.out.println("");
        inst4.display();
    }
}

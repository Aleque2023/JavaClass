package module6;

public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision ints1 = new InternationalDivision(null, null, null, null);
        InternationalDivision inst2 = new InternationalDivision(null, null, null, null);

        DomesticDivision inst3 = new DomesticDivision(null, null, null);
        DomesticDivision inst4 = new DomesticDivision(null, null, null);

        ints1.display();
        System.out.println("");
        inst2.display();
        System.out.println("");
        inst3.display();
        System.out.println("");
        inst4.display();
    }
}

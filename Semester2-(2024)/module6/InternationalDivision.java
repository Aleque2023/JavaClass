package module6;

public class InternationalDivision {
    private String country;
    private String language;

    public InternationalDivision(String divisName, String accNum, String country, String language) {
        super(divisName, accNum);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisName + "\nAccount Number: " + accNum + "\nCountry: " + country + "\nLanguage: " + language);
    }
}

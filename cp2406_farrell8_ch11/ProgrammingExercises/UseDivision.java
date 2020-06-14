public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision Div1 = new DomesticDivision("Base", 12345, "Townsville");
        InternationalDivision Div2 = new InternationalDivision("Headquarters", 10000, "USA");
        Div1.display();
        Div2.display();
    }
}

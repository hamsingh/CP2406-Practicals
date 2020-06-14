public class InternationalDivision extends Division{
    protected String country;
    public InternationalDivision(String name, int account, String country){
        super(name, account);
        country = country;
    }
    public void display(){
        System.out.println("International Division: " + name + "Account Number: " + account);
    }
}

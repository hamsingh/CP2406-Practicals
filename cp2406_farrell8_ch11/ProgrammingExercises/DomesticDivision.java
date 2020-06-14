public class DomesticDivision extends Division{
    protected String state;
    public DomesticDivision(String name, int account, String state){
        super(name, account);
        state = state;
    }
    public void display(){
        System.out.println("Domestic Division: " + name + "Account Number: " + account + "State:" + state);
    }
}

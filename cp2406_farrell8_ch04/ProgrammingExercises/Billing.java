public class Billing
{
    public static void main(String args[])
    {
        double price = 10;
        double quantity = 3;
        double coupon = 2.5;
        computeBill(price);
        computeBill(price, quantity);
        computeBill(price, quantity, coupon);
    }

    public static void computeBill(double price)
    {
        final double TAX = 0.08;
        double total;
        total = (price * TAX) + price;
        System.out.println("The total due is " + total);
    }

    public static void computeBill(double price, double quantity)
    {
        final double TAX = 0.08;
        double total;
        total = (price * quantity) + (price * quantity * TAX);
        System.out.println("The total due is " + total);
    }

    public static void computeBill(double price, double quantity, double coupon)
    {
        final double TAX = 0.08;
        double total;
        total = (price * quantity) + (price * quantity * TAX) - coupon;
        System.out.println("The total due is " + total);
    }
}

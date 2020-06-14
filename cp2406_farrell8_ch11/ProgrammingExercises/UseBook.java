public class UseBook {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("");
        NonFiction book2 = new NonFiction("");
        System.out.println("Fiction: " + book1.getTitle() + "costs $" + book1.getPrice());
        System.out.println("Non-Fiction: " + book2.getTitle() + "costs $" + book2.getPrice());
    }
}

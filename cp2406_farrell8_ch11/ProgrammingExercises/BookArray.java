public class BookArray {
    public static void main(String[] args) {
        Book[] BookArray = new Book[10];
        BookArray[0] = new Fiction("a");
        BookArray[1] = new NonFiction("b");
        BookArray[2] = new Fiction("c");
        BookArray[3] = new Fiction("d");
        BookArray[4] = new Fiction("e");
        BookArray[5] = new NonFiction("f");
        BookArray[6] = new Fiction("g");
        BookArray[7] = new Fiction("h");
        BookArray[8] = new NonFiction("i");
        BookArray[9] = new NonFiction("j");
        for(int x = 0; x < BookArray.length; ++x)
            System.out.println(BookArray[x].getTitle() + "costs $" + BookArray[x].getPrice());
    }
}

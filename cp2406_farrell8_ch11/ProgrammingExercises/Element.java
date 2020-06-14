public abstract class Element {
    protected String symbol;
    protected int number;
    protected int weight;
    public Element(String symbol, int number, int weight){
        symbol = symbol;
        number = number;
        weight = weight;
    }
    public String getSymbol() {
        return symbol;
    }
    public int getNumber() {
        return number;
    }
    public int getWeight() {
        return weight;
    }
    public abstract void describeElement();
}

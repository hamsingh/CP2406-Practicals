public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int number, int weight){
        super(symbol, number, weight);
    }
    public void describeElement(){
        System.out.println("Metal: " + getSymbol() + "Atomic Number: " + getNumber() + "Atomic Weight: " + getWeight() + "Description: Is a bad conductor of electricity");
    }
}

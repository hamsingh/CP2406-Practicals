public class MetalElement extends Element{
    public MetalElement(String symbol, int number, int weight){
        super(symbol, number, weight);
    }
    public void describeElement(){
        System.out.println("Metal: " + getSymbol() + "Atomic Number: " + getNumber() + "Atomic Weight: " + getWeight() + "Description: Is a good conductor of electricity");
    }
}

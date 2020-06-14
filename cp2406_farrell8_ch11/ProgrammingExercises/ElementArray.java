public class ElementArray {
    public static void main(String[] args) {
        Element elements[] = new Element[4];
        elements[0] = new MetalElement("A", 50, 120);
        elements[1] = new NonMetalElement("B", 80, 220);
        elements[2] = new MetalElement("C", 20, 180);
        elements[3] = new NonMetalElement("D", 60, 90);
        for(int x = 0; x < elements.length; x++)
            elements[x].describeElement();
    }
}

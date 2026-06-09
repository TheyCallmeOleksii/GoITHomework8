public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape myCircle = new Circle();
        Shape myQuad = new Quad();
        Shape myTriangle = new Triangle();
        Shape myRectangle = new Rectangle();
        Shape myDodecahedron = new Dodecahedron();

        printer.printName(myCircle);
        printer.printName(myQuad);
        printer.printName(myTriangle);
        printer.printName(myRectangle);
        printer.printName(myDodecahedron);
    }
}
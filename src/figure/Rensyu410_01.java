package figure;

public class Rensyu410_01 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("三角形");
        triangle.setApexes(3);
        triangle.showApexes();
        triangle.areaMethod(8, 4);

        System.out.println("四角形");
        square.setApexes(4);
        square.showApexes();
        square.areaMethod(8, 4);
    }
}

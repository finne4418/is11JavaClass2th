package figure;

public class Triangle extends Figure {
    public void areaMethod(int su1, int su2) {
        System.out.println("面積は底辺×高さ÷2です。");
        System.out.println(su1 + " × " + su2 + " ÷ 2 = " + (su1 * su2 / 2));
    }
}
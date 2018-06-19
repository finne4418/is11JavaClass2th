package figure;

public class Square extends Figure {
    public void areaMethod(int su1, int su2) {
        System.out.println("面積は縦 × 横です。");
        System.out.println(su1 + " × " + su2 + " = " + (su1 + su2));
    }
}
